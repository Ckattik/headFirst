package patternDecorator;

public abstract class Beverage {

	public int TALL;
	public int GRADLE;
	public int VENTI;
	
	String description = "Unknown Beverage";                    
	
	public String getDescription() {
		return description;                   // Метод getDescription уже реализован а метод cost() необходимо реализовать в субклассах
 	}
	public abstract double cost();
	
	public abstract int getSize();
}
