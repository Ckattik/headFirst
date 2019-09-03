package headFirstPatternModelViewController;

public class BeatController implements ControllerInterface{          // Контроллер реализует ControllerInterface 

	BeatModelInterface model;                                        // Контроллер получает обьекты модели и представления и связывает их воедино
	DJView view;                             
	
	public BeatController(BeatModelInterface model) {                
		// TODO Auto-generated constructor stub
		this.model = model;
		view = new DJView (this, model); 
		view.createView();                                           // Контроллер получает модель в конструкторе и создает представлениее
		view.createControls();
	    view.disableStopMenuItem();
	    view.enableStartMenuItem();
	    model.initialize();
	
	}
	
	
	@Override
		public void start() {                                    // При выборе команды Start контроллер активизирует модель и изменяет 
		                                                         // пользовательский интерфейс : команда Start блокируеться, а команда 
			// TODO Auto-generated method stub                   // Stop становиться доступной
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();                   //ВНИМАНИЕ!!! Все разумные решения за представления принимает контроллер.Представление 
		}                                            // умеет только устанавливать и снимать блокировку команд меню; оно не знает 
	                                                 // в каких ситуациях это следует делать 
	@Override
		public void stop() {                                    // И наоборот при віборе команды контроллера деактивизирует модель, 
			// TODO Auto-generated method stub                  // команда Start становиться доступной, а команда Stop блокируеться 
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		}
	
	@Override
	public void increaseBPM() {                         // При щелчке на кнопке увеличения контроллер получает текущюю частоту от модели 
		// TODO Auto-generated method stub              // увеличивает ее на 1 и задает результат как новое значение частоты
	    int bpm = model.getBPM();                       
	    model.setBPM(bpm + 1);
	}
	
	@Override
		public void decreaseBPM() {                      // тоже самое только частота уменьшаеться на 1 
			// TODO Auto-generated method stub
		int bpm = model.getBPM();
		model.setBPM(bpm - 1); 
		}
	
	public void setBPM(int bpm) {                       // Наконец если поьзоватеь ввел произвольную частоту, контроллер приказывает модели 
		model.setBPM(bpm);                              // перейти на новое значение
	}
	
	
}
