package patternDecorator;

public class Decaf extends Beverage {
 
	public Decaf() {
		description = "Decaf coffe";
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}
}
