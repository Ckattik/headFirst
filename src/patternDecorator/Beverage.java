package patternDecorator;

public abstract class Beverage {

	public int TALL;
	public int GRADLE;
	public int VENTI;
	
	String description = "Unknown Beverage";                    
	
	public String getDescription() {
		return description;                   // ����� getDescription ��� ���������� � ����� cost() ���������� ����������� � ����������
 	}
	public abstract double cost();
	
	public abstract int getSize();
}
