package headFirstPatternDeputyPartTwo;

public class NoQuaterState implements State {

	transient GumballMachine gumballMachine;       // В каждой реализации State переменная GumballMachine помеченая ключевым словом transient 
	                                               // Оно сообщает JVM что это поле не сериализуеться
	
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
