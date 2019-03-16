package headFirst_SinUDuck_impl_Startegy;

public class RedheadDuck extends Duck implements Quackble, Flyble{

	public void display() {
		System.out.println("See RedheadDuck");
	}
	
	public void fly() {
		System.out.println("fly RedheadDuck");
	}
	
	public void quack() {
		System.out.println("Quak RedheadDuck");
	}

}
