package headFirstPatternStatePartTwo;

public class NoQuaterState implements State {                     // ����� ������ ����������� ��������� State

	
	GumballMachine gumballMachine;                                // ������������ ����������� ������ �� ������ ��������, ������� 
	                                                              // ������ ������������ � ���������� ����������
	public NoQuaterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		
		this.gumballMachine = gumballMachine;
	}
	
	
	@Override
	public void insertQuarter() {                                // ���� � ������� ������� �������, ������� ��������� � ������� � ��������� 
 		// TODO Auto-generated method stub                                               HasQuaterState
		System.out.println("You inserted a quater");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	@Override
	public void ejectQuater() {                                   // ��� �� ������� ������� ����� �� ������� ������� 
		// TODO Auto-generated method stub
		System.out.println("You have`t inserted a quater");
	}
	
	@Override
	public void turnCrank() {                                     // ��� ������� ��� ������
		// TODO Auto-generated method stub
		System.out.println("You turned, but there is no quater");
	}
	
	@Override
	public void dispense() {                                      // ����� ��������� ������ �� �������
		// TODO Auto-generated method stub
		System.out.println("You need to play first");
	}

	
}
