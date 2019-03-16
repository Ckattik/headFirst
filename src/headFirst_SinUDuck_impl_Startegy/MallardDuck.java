package headFirst_SinUDuck_impl_Startegy;

public class MallardDuck extends Duck implements Flyble, Quackble{

	public void display() {
		System.out.println("See MallardDuck");
	}
	
	
	public void fly() {
		System.out.println("fly MallardDuck");
	}
	
	
	public void quack() {
		System.out.println("quak MallardDuck");
	}
}
