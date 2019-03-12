package headFirst_SinUDuck_Behavior;

import headFirst_SinUDuck_Interface.QuackBehavior;

public class Duck {

	
	FlyBehavior flyBehavior;
	QuakBehavior quackBehavior;
	
	
	
	
	
	public void swim() {
		System.out.println("Bul Duck");
	}
	
	
	public void display() {
		System.out.println("See Duck");
	}
	
	public void perfomQuack() {
		quackBehavior.quak();
        		
		System.out.println("Quak &&&&");
	}
	
	public void perfomFly() {
		
		flyBehavior.fly();
		System.out.println("Fly &&&&");
	}
	

	
	
}
