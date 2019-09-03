package headFirstPatternModelViewController;

public class DJTestDrive {

	public static void main(String [] args) {
		
		BeatModelInterface model = BeatModel();                              // Сначала создаеться модель 
		ControllerInterface controller = new BeatControllerInterface(model); // Затем создаем контроллер и передаем ему модель 
	}                                                                        // Напомним что предсавление создаеться контролером потому нам 
	                                                                         // этого делать не нужно
	
}
