package headFirstPatternFacade;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amplifire amp = new Amplifire(); 
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();
		
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, popper);
		
		homeTheater.watchMovie("Raiders of the lost Ark");
		homeTheater.endMovie();
		
		
		
	}

}
