package headFirstPatternDeputyPartTwo;

public class NoQuaterState implements State {

	transient GumballMachine gumballMachine;       // � ������ ���������� State ���������� GumballMachine ��������� �������� ������ transient 
	                                               // ��� �������� JVM ��� ��� ���� �� ��������������
	
	@Override
	public void despense() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
