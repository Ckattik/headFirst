package headFirstPatternStatePartTwo;

public class SoldState implements State{

	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	
	@Override
	public void insertQuarter() {                                                 //некоректные действи€ этого состо€€ни€
		// TODO Auto-generated method stub
		System.out.println("Please wait, we`re already giving you a gumball");
	}
	
	@Override                                                                     //некоректные действи€ этого состо€€ни€
	public void ejectQuater() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, you alredy turned the crank");
	}
	
	@Override                                                                      //некоректные действи€ этого состо€€ни€
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turning twice doesn`t get you another gumball!");
	}
	
	@Override
	public void dispense() {                                  
		// TODO Auto-generated method stub                                          // Ќаходимс€ в состо€нии SoldState т.е. покупка оплачена.
		gumballMachine.releaseBall();                                               // —начала приказываем автомату выдать шарик                     
	   if(gumballMachine.getCount() > 0) {                                          // «атем провер€ем количество шариков и в зависимоти от результата  
		   gumballMachine.setState(gumballMachine.getNoQuarterState());             // переходим в состо€ние NoQuarterState или SoldOutState
	   }else {
		   System.out.println("Oops, out of gumballs!");
		   gumballMachine.setState(gumballMachine.getSoldOutState());
	   }
		
		
		
	}

	
	
}
