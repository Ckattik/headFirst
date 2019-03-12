package headFirst_SinUDack_Abstract;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
		
	}
	
	
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
       System.out.println("I'am a model duck");
	}

	
	
	
	
}
