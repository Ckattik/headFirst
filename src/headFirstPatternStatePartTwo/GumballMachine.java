package headFirstPatternStatePartTwo;

public class GumballMachine {
	
	State soldOutState;                             // ��� ��������� ��������� 
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;                     // ���������� ���������� ��� �������� State 
	int count = 0;                                  // � ���������� count ��������� ���������� ������� - ���������� ������� ���� 

	String location;
	
	
	
	public GumballMachine(String location, int numberGumballs) {     // ����������� �������� �������� ���������� ������� � ��������� ��� � ����������
		// TODO Auto-generated constructor stub     // ����� ������� ���������� State ��� ���� ��������� 
		soldOutState = new SoldState(this);
	    noQuarterState = new NoQuaterState(this);
		hasQuarterState = new HasQuaterState(this);
		soldState = new SoldOutState(this);
		
		this.location = location;
		
		this.count = numberGumballs;
		if(numberGumballs > 0) {
			state = noQuarterState;                  // ���� ���������� ������� ������ ���� �� ������������� ��������� NoQuarterState
		}
		
	}
	
	
	public void insertQuater() {                     // �������� ������������ ����� ������ : �������� ������������� ������� �������� ��������� 
		state.insertQuarter();
	}
	
	public void ejectQuater() {
		state.ejectQuater();
	}
	
	public void turnCrank() {                        // ��� ������ dispense() � ������ GumballMachine ����� �������� �� ����� ��������� ��� 
		state.turnCrank();                           // ��������� �������� ������������ �� ����� �������� ����������� ��� �� ������� ����� �����.
		state.dispense();                            // ������ ����� disponse() ��� ������� State ��������� �� ������ turnCrank()
	}
	
	public void setState(State state) {              // ���� ����� ��������� ������ �������� ��������� ������� � ������ ��������� 
		this.state = state;
	}
	
	public void releaseBall() {                                         // ��������������� ����� �������� ����� � ��������� �������� ����������
		System.out.println("A gumball comes rolling out the slot...");  // count �� -1 
		if(count != 0) {
			count = count - 1;
		}
	}
	
	
	
	
	
	public State getState() {
		return state;
	}
	
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public int getCount() {
		return count;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
		
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}


     public String getLocation() {
		return location;
	}


}
