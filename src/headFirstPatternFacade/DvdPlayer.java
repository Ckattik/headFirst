package headFirstPatternFacade;

public class DvdPlayer {

	String movie;
	
	public void on() {
		System.out.println("Dvd on");
	}
	
public void play(String movie) {
	System.out.println("Dvd play");
	}

public void stop() {
	System.out.println("Dvd stop");
}

public void eject() {
	System.out.println("Dvd eject");
}

public void off() {
	System.out.println("Dvd off");
}

}
