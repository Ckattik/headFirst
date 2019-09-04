package headFirstPatternModelViewController;

public class DJTestDrive {

	public static void main(String [] args) {
		
		BeatModelInterface model = new BeatModel();                              // Сначала создаеться модель 
		ControllerInterface controller = new BeatController(model);               // Затем создаем контроллер и передаем ему модель 
	}                                                                        // Напомним что предсавление создаеться контролером потому нам 
	                                                                         // этого делать не нужно
	
}
