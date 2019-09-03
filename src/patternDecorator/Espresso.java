package patternDecorator;

public class Espresso extends Beverage{    //��� ����� ���������� �������� ��������� Beverage 

	
	public Espresso() {                   // �������� ��������� � ������������ ������ ����� ��������� ��� ���������� description ������������ �� Beverage
		description = "Espresso";
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	@Override                                   //��������� ��������� ��������� �������. � ���� ������ ������������ � ����������� �� ����� 
        	public double cost() {              //������� �� ������ ���������� ��������� �������� Espresso $1.99
		// TODO Auto-generated method stub
		return 1.99;
	}
	
}
