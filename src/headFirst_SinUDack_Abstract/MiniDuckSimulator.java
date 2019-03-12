package headFirst_SinUDack_Abstract;

public class MiniDuckSimulator {

	public static void main (String [] args) {
		
		
		Duck mallard = new MallardDuck();
		mallard.perfomFly();
		mallard.perfomQuack();
		
		System.out.println("////////////////");
		
		Duck model = new ModelDuck();
		model.perfomFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.perfomFly();
		
		System.out.println("////////////////");
		
		model.perfomQuack();
		model.setQuackBehavior(new QuackTheFrog());
		model.perfomQuack();
		
		System.out.println("////////////////");
		
		model.perfomQuack();
		model.setQuackBehavior(new QuackTheDof());
		model.perfomQuack();
		
	}
	
}
