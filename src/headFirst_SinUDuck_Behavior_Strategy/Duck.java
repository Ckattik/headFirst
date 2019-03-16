package headFirst_SinUDuck_Behavior_Strategy;

import headFirst_SinUDuck_Interface_Startegy.QuackBehavior;

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
