package patternDecorator;

public class Mocha extends CondimentDecorator{                // CondimentDecorator ��������� Beverage
	Beverage beverage;                                        //��� �� � ������� Mocha ��������� ������ �� Beverage ��� ������������ :
	                                                              // 1.���������� ��� �������� ������
                                                                  // 2.������ ������������ ���������� ������ �� ������. �� ����� ���������� ������ 
	                                                              // ��� ������ ������������ 
	
	public Mocha(Beverage beverage) {
		
		this.beverage = beverage;
		
	}
                                                               //� �������� ������ ����������� �� ����� �������� ������� �� � ��� ���������� ��������	
  	@Override                                                  // "Dark Roas Mocha".����� ������� �� ������� �������� ��������, ��������� ����� 
 		public String getDescription() {                       // ����������� ������� � ����� ������������ ��� ������� ", Mocha"
			// TODO Auto-generated method stub
			return beverage.getDescription() + ", Mocha";
		}
	
	@Override
		public double cost() {
			// TODO Auto-generated method stub
			return 20 + beverage.cost();
		}

}
