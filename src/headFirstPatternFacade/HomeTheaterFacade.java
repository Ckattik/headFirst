package headFirstPatternFacade;

public class HomeTheaterFacade {

	Amplifire amp;                  //Композиция : компоненты подсистемы которые мы собираемся использовать 
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifire amp,          // В конструкторе фассада передаються ссылки на все компоненты.Фасад присваивает их                   
	                         Tuner tuner,            // соответсвующим переменным экземляра
	                         DvdPlayer dvd,
	                         CdPlayer cd,
	                         Projector projector,
	        
	                         Screen screen,
	                         PopcornPopper popper) {
		// TODO Auto-generated constructor stub
		this.amp = amp;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper; 
		
		
	}
	
	public void watchMovie(String movie) {                     // Метод WatchMovie выполняет те же операции, которые нами выполнялись ранее вручную 
		System.out.println("Get ready to watch a movie ...");  // Обратите внимание :выполнение каждой операции делегируеться соответствующему 
		popper.on();                                           // компоненту подсистемы
		popper.pop();
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd();
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
		
	}
	
	public void endMovie() {                                      
		System.out.println("Shutting movie theater down ...");
		popper.off();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
	
	
}
