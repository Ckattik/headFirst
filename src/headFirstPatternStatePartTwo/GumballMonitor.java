package headFirstPatternStatePartTwo;

public class GumballMonitor {

	GumballMachine machine;
	
	public GumballMonitor(GumballMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}
	
	
	
	public void report() {                                                           // Метод report() выводит отчет с информацией о местонахождении количистве шариков и состоянии машины
		System.out.println("Gumball Machine:  " + machine.getLocation() );
		System.out.println("Current inventory " + machine.getCount() + "gumballs .");
		System.out.println("Current state " + machine.getState());
	}
	
	
	
	
	
	
	
	
	
}
