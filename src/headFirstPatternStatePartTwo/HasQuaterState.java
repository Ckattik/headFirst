package headFirstPatternStatePartTwo;

import java.util.Random;

public class HasQuaterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis()); // ƒобавл€ем генератор случайных чисел 
	GumballMachine gumballMachine;                      
	
	
	public HasQuaterState(GumballMachine gumballMachine) {   // ѕри создании Їкземпл€ра состо€ни€ ему передаетьс€ ссылка на GumballMachine 
		// TODO Auto-generated constructor stub              // ќна используетьс€ дл€ перевода автомата в другое состо€ние 
		this.gumballMachine = gumballMachine;
	}
	
	
	
	
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can`t insert another quater");            // Ќекоректное действие дл€ этого состо€ни€ 
	}
	
	@Override
	public void ejectQuater() {                                           // ¬ернуть монетку и перевести в состо€ние NoQuaterState
		// TODO Auto-generated method stub
		System.out.println("Quater returned");
		
		int winner = randomWinner.nextInt(10);                            // ≈сли покупателю повезло и в автомате осталс€ второй шарик переходим в 
		if((winner == 0) && (gumballMachine.getCount() > 1)){             // состо€ние WinnerState; в противном случае переходим в состо€ние 
			gumballMachine.setState(gumballMachine.getWinnerState());     // SoldState(как делалось раньше)
		}else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
		
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	@Override
	public void turnCrank() {                                             //  огда покупать дергает за рычаг, автомат переходит в состо€ние SoldState 
		// TODO Auto-generated method stub                                // (вызовом метода setState())/ƒл€ получени€ обьекта SoldState используетьс€ 
		System.out.println("You turned ...");                             // метод getSoldState().
		gumballMachine.setState(gumballMachine.getSoldState());
	}
	
	@Override
	public void dispense() {                                              // ƒпугие некоректные действи€ дл€ етого состо€ни€ 
		// TODO Auto-generated method stub
		System.out.println("No Gumball dispensed");
	}

}
