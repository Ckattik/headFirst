package headFirst_SinUDuck_impl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RubberDuck rDuck = new RubberDuck();
		RedheadDuck redDuck = new RedheadDuck();
		MallardDuck mDuck = new MallardDuck();
		DecoyDuck dDuck = new DecoyDuck();
		
		Duck duck = new Duck();
		
		duck.display();
		duck.swim();
		
		System.out.println();
		
		rDuck.quack();
		rDuck.swim();         // Если нету в дочернем класе вызываеться в класе родитель
		
		
		
		
	}

}
