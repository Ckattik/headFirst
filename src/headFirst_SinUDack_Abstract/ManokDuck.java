package headFirst_SinUDack_Abstract;

public class ManokDuck implements QuackBehavior {

	public void display() {
		System.out.println("I'am manok");
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub

		System.out.println("I'am not Quack");
		
		
	}

}
