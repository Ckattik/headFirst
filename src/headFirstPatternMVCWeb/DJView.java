package headFirstPatternMVCWeb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


/*import headFirstPatternModelViewController.BPMObserver;
import headFirstPatternModelViewController.BeatBar;
import headFirstPatternModelViewController.BeatModelInterface;
import headFirstPatternModelViewController.BeatObserver;
import headFirstPatternModelViewController.ControllerInterface;*/

public class DJView extends HttpServlet implements ActionListener{  // Разширяем класс HttpServlet дя поучения доступа к основной функциональности 
                                                                    // сервлета(в часности получению запросов HTTP)
	
	
	public void init() throws ServletException{              // Метод init() вызываеться при создании сервлета 
		BeatModel beatModel = new BeatModel();               // Сначала создаем обьект BeatModel
		beatModel.initialize();
		getServletContext().setAttribute("beatModel", beatModel); // Сохраняем ссылку на него в контексте сервлета для удобства дальнейший обращений 
	}
	
	// Метод doPost
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// Реализация        
		                                                         // Вся основная  робота віполняеться в методе doGet
	
	BeatModel beatModel = (BeatModel)getServletContext().getAttribute("beatModel"); // Получаем ссылку на модель из контекста сервлета 
	String bpm = request.getParametr("bpm");                                        // Затем получаем команды/параметры HTTP
	
	if(bpm == null) {                                                               
		bpm = beatModel.getBPM() + "";                                              
		
	}
	
	String set = request.getParameter(set);                            // Если получена команда записи, получаем присваимое
	if(set != null) {                                                  // значение и сообщаем модели
		int bpmNumber = 90;
		Integer.parseInt(bpm);
		beatModel.setBPM(bpmNumber);
	}
	
	
	String decrease = request.getParameter(decrease);                //Получаем текущюю частоту от модели уменьшаем/увеличиваем на 1
	      if(decrease != null) {
	    	  beatModel.setBPM(beatModel.getBPM() - 1);
	      }
	
    String increase = request.getParameter(increase);
         if(increase != null) {
        	 beatModel.setBPM(beatModel.getBPM() + 1);
         }
	      
	String on = request.getParameter(on);                         // Если получена команда запуска или остановки выполняем соответствующее
	  if(on != null) {                                            // действие с моделю
		  beatModel.start();
	  }
	  
	  String off = request.getParameter(off);
	  if(off != null) {
		  beatModel.stop();
	  }
	      
	  request.setAttribute("beatModel", beatModel);          // Робота контроллера закончена. Передаем управление представлению,
	                                                         // что бы оно сгенерировало код HTML
	  
	  RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/DjView.jsp"); // В соответствии с определением Модели 2 
	  dispatcher.forward(request, response);                                          // мы передаем JSP JavaBean с состоянием модели 
	                                                                                  // В нашем случае передаеться сама модель поскольку она 
	                                                                                  // реализована в виде JavaBean
	}
	
	
	BeatModelInterface model;         // В представлении храняться ссылки на модель и на контроллер. Контроллер используеться только 
	ControllerInterface controller;   // управляющими елементами до которых мы скоро доберемся
	
	JLabel bpmLabel;
	JTextField bpmTExtField;
	JButton setBMPButton;
	JButton increaseBMPButton;
	JButton decreaseBMPButton;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem startMenuItem;
	JMenuItem stopMenuItem;
	
	
	JFrame viewFrame;                 // Создание отображаемых компонентов
	JPanel viewPanel;
	BeatBar beatBar;
	JLabel bpmOutputLabel;
	
	public void createControls() {            // Метод создает все елементы управления и размещает их в интерфейсе приложения, а также создает меню
		//Create all Swing components here    // При вызове команды Start и Stop вызываються соответствующие методы контроллера
	}
	
	public void enableStopMenuItem() {        // Методы установления и снятия блокировки команд меню Start и Stop. Как будет показано вскоре 
		stopMenuItem.setEnabled(true);        // контроллер использует эти методы для управления интерфейсом
	}
	
	public void disableStopMenuItem() {
		stopMenuItem.setEnabled(false);
	}
	
	public void enableStartMenuItem() {
		startMenuItem.setEnabled(true);
	}
	
	public void disableStartMenuItem() {
		startMenuItem.setEnabled(false);
	}
	
	
	
	
	
	
	@Override                                          //Метод вызываеться при щелчке на кнопке 
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == setBMPButton) {
			int bpm = Integer.parseInt(bpmTExtField.getText());
			
			controller.setBPM(bpm);                                 // Если выбрана кнопка set действие передаеться контроллеру с новой частотой
			
		}else if(event.getSource() == increaseBMPButton) {
			
			controller.increaseBMP();                               // Если выбрана кнопка увеличения или уменьшения частоты эта информация также 
			                                                        // передаеться контроллеру
			
		}else if(event.getSource() == decreaseBMPButton)
		   
			controller.decreaseBMP();
	}
	
	
	
	
	public DJView(ControllerInterface controller, BeatModelInterface model) {
		// TODO Auto-generated constructor stub                                // Коструктор получет ссылки на контроллер и модель
		this.controller = controller;                                          // и сохраняет их в переменной
		this.model = model;
		
		model.registerObserver((BeatObserver)this);                            // Представление регистрируеться в качестве наблюдателя 
		model.registerObserver((BPMObserver) this);                            // BeatObserver и BPMObserver модели
		
		
	}
	
	public void createView() {
		// Create all Swing components here 
	}
	
	public void updateBPM() {
		int bpm  = model.getBPM();
		if(bpm == 0) {
			bpmOutputLabel.setText("Current BPM :  " + model.getBPM());
		}
	}
	
	public void updateBeat() {                 // Метод updateBeat вызываеться в начале нового удара. Когда это происходит, необходимо отобразить импульс
		beatBar.setValue(100);                 // на индикаторе ритма. Для этого индикатору присваиваеться максимально возможное значение 
	}

	
}
