package headFirstPatternStatePartTwo;

import java.util.Random;

public class HasQuaterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis()); // ��������� ��������� ��������� ����� 
	GumballMachine gumballMachine;                      
	
	
	public HasQuaterState(GumballMachine gumballMachine) {   // ��� �������� ���������� ��������� ��� ����������� ������ �� GumballMachine 
		// TODO Auto-generated constructor stub              // ��� ������������� ��� �������� �������� � ������ ��������� 
		this.gumballMachine = gumballMachine;
	}
	
	
	
	
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can`t insert another quater");            // ����������� �������� ��� ����� ��������� 
	}
	
	@Override
	public void ejectQuater() {                                           // ������� ������� � ��������� � ��������� NoQuaterState
		// TODO Auto-generated method stub
		System.out.println("Quater returned");
		
		int winner = randomWinner.nextInt(10);                            // ���� ���������� ������� � � �������� ������� ������ ����� ��������� � 
		if((winner == 0) && (gumballMachine.getCount() > 1)){             // ��������� WinnerState; � ��������� ������ ��������� � ��������� 
			gumballMachine.setState(gumballMachine.getWinnerState());     // SoldState(��� �������� ������)
		}else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
		
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	@Override
	public void turnCrank() {                                             // ����� �������� ������� �� �����, ������� ��������� � ��������� SoldState 
		// TODO Auto-generated method stub                                // (������� ������ setState())/��� ��������� ������� SoldState ������������� 
		System.out.println("You turned ...");                             // ����� getSoldState().
		gumballMachine.setState(gumballMachine.getSoldState());
	}
	
	@Override
	public void dispense() {                                              // ������ ����������� �������� ��� ����� ��������� 
		// TODO Auto-generated method stub
		System.out.println("No Gumball dispensed");
	}

}
