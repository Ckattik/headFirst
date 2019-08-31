package headFirstPatternStatePartTwo;

public class GumballMonitor {

	GumballMachine machine;
	
	public GumballMonitor(GumballMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}
	
	
	
	public void report() {                                                           // ����� report() ������� ����� � ����������� � ��������������� ���������� ������� � ��������� ������
		System.out.println("Gumball Machine:  " + machine.getLocation() );
		System.out.println("Current inventory " + machine.getCount() + "gumballs .");
		System.out.println("Current state " + machine.getState());
	}
	
	
	
	
	
	
	
	
	
}
