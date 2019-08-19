package headFirstPatternStatePartTwo;

public class WinnerState implements State {
	
GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	
	@Override
	public void insertQuarter() {                                                 //некоректные действия этого состояяния
		// TODO Auto-generated method stub
		System.out.println("Please wait, we`re already giving you a gumball");
	}
	
	@Override                                                                     //некоректные действия этого состояяния
	public void ejectQuater() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, you alredy turned the crank");
	}
	
	@Override                                                                      //некоректные действия этого состояяния
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turning twice doesn`t get you another gumball!");
	}
	
	@Override
	public void dispense() {                                                            // Выдаем два шарика после чего переходим либо в состояние 
		// TODO Auto-generated method stub                                              // NoQuarterState или SoldOutState
		System.out.println("YOU`RE A WINNER !!! You get to gumballs for you quater");
		gumballMachine.releaseBall();                                                    
		if(gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else {
			gumballMachine.releaseBall();                                               // Если в автомате есть второй шарик освобождаем его 
			if(gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else {
				System.out.println("Oops, out of gumballs");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
		
		
		
		
	}

}
