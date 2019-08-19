package headFirstPatternStatePartTwo;

public class SoldOutState implements State{
	
GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	                                                      // В состояниии SoldOutState никакие действия не возможны пока кто то не заправит автомат  
	                                                      // шариками
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can`t insert a quater, the machine is sold out");		
	}
	
	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		System.out.println("You can`t eject, you haven`t inserted a quater yet");
	}
	
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You terned, but there are no gumballs");
	}
	
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumballs dispensed");
	}
  
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "sold out";
		}
	

}
