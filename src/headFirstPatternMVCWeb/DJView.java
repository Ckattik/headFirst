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

public class DJView extends HttpServlet implements ActionListener{  // ��������� ����� HttpServlet �� �������� ������� � �������� ���������������� 
                                                                    // ��������(� �������� ��������� �������� HTTP)
	
	
	public void init() throws ServletException{              // ����� init() ����������� ��� �������� �������� 
		BeatModel beatModel = new BeatModel();               // ������� ������� ������ BeatModel
		beatModel.initialize();
		getServletContext().setAttribute("beatModel", beatModel); // ��������� ������ �� ���� � ��������� �������� ��� �������� ���������� ��������� 
	}
	
	// ����� doPost
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// ����������        
		                                                         // ��� ��������  ������ ����������� � ������ doGet
	
	BeatModel beatModel = (BeatModel)getServletContext().getAttribute("beatModel"); // �������� ������ �� ������ �� ��������� �������� 
	String bpm = request.getParametr("bpm");                                        // ����� �������� �������/��������� HTTP
	
	if(bpm == null) {                                                               
		bpm = beatModel.getBPM() + "";                                              
		
	}
	
	String set = request.getParameter(set);                            // ���� �������� ������� ������, �������� ����������
	if(set != null) {                                                  // �������� � �������� ������
		int bpmNumber = 90;
		Integer.parseInt(bpm);
		beatModel.setBPM(bpmNumber);
	}
	
	
	String decrease = request.getParameter(decrease);                //�������� ������� ������� �� ������ ���������/����������� �� 1
	      if(decrease != null) {
	    	  beatModel.setBPM(beatModel.getBPM() - 1);
	      }
	
    String increase = request.getParameter(increase);
         if(increase != null) {
        	 beatModel.setBPM(beatModel.getBPM() + 1);
         }
	      
	String on = request.getParameter(on);                         // ���� �������� ������� ������� ��� ��������� ��������� ���������������
	  if(on != null) {                                            // �������� � ������
		  beatModel.start();
	  }
	  
	  String off = request.getParameter(off);
	  if(off != null) {
		  beatModel.stop();
	  }
	      
	  request.setAttribute("beatModel", beatModel);          // ������ ����������� ���������. �������� ���������� �������������,
	                                                         // ��� �� ��� ������������� ��� HTML
	  
	  RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/DjView.jsp"); // � ������������ � ������������ ������ 2 
	  dispatcher.forward(request, response);                                          // �� �������� JSP JavaBean � ���������� ������ 
	                                                                                  // � ����� ������ ����������� ���� ������ ��������� ��� 
	                                                                                  // ����������� � ���� JavaBean
	}
	
	
	BeatModelInterface model;         // � ������������� ��������� ������ �� ������ � �� ����������. ���������� ������������� ������ 
	ControllerInterface controller;   // ������������ ���������� �� ������� �� ����� ���������
	
	JLabel bpmLabel;
	JTextField bpmTExtField;
	JButton setBMPButton;
	JButton increaseBMPButton;
	JButton decreaseBMPButton;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem startMenuItem;
	JMenuItem stopMenuItem;
	
	
	JFrame viewFrame;                 // �������� ������������ �����������
	JPanel viewPanel;
	BeatBar beatBar;
	JLabel bpmOutputLabel;
	
	public void createControls() {            // ����� ������� ��� �������� ���������� � ��������� �� � ���������� ����������, � ����� ������� ����
		//Create all Swing components here    // ��� ������ ������� Start � Stop ����������� ��������������� ������ �����������
	}
	
	public void enableStopMenuItem() {        // ������ ������������ � ������ ���������� ������ ���� Start � Stop. ��� ����� �������� ������ 
		stopMenuItem.setEnabled(true);        // ���������� ���������� ��� ������ ��� ���������� �����������
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
	
	
	
	
	
	
	@Override                                          //����� ����������� ��� ������ �� ������ 
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == setBMPButton) {
			int bpm = Integer.parseInt(bpmTExtField.getText());
			
			controller.setBPM(bpm);                                 // ���� ������� ������ set �������� ����������� ����������� � ����� ��������
			
		}else if(event.getSource() == increaseBMPButton) {
			
			controller.increaseBMP();                               // ���� ������� ������ ���������� ��� ���������� ������� ��� ���������� ����� 
			                                                        // ����������� �����������
			
		}else if(event.getSource() == decreaseBMPButton)
		   
			controller.decreaseBMP();
	}
	
	
	
	
	public DJView(ControllerInterface controller, BeatModelInterface model) {
		// TODO Auto-generated constructor stub                                // ���������� ������� ������ �� ���������� � ������
		this.controller = controller;                                          // � ��������� �� � ����������
		this.model = model;
		
		model.registerObserver((BeatObserver)this);                            // ������������� ��������������� � �������� ����������� 
		model.registerObserver((BPMObserver) this);                            // BeatObserver � BPMObserver ������
		
		
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
	
	public void updateBeat() {                 // ����� updateBeat ����������� � ������ ������ �����. ����� ��� ����������, ���������� ���������� �������
		beatBar.setValue(100);                 // �� ���������� �����. ��� ����� ���������� �������������� ����������� ��������� �������� 
	}

	
}
