package headFirstPatternStatePartTwo;

public class NoQuaterState implements State {                     // Класс должен реализовать интерфейс State

	
	GumballMachine gumballMachine;                                // Конструктору передаеться ссылка на обьект автомата, которая 
	                                                              // просто сохраняеться в переменной экземпляра
	public NoQuaterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		
		this.gumballMachine = gumballMachine;
	}
	
	
	@Override
	public void insertQuarter() {                                // Если в автомат брошена монетка, вывести сообщение и перейти в состояние 
 		// TODO Auto-generated method stub                                               HasQuaterState
		System.out.println("You inserted a quater");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	@Override
	public void ejectQuater() {                                   // Что бы вернуть монетку нужно ее сначала бросить 
		// TODO Auto-generated method stub
		System.out.println("You have`t inserted a quater");
	}
	
	@Override
	public void turnCrank() {                                     // Нет монетки нет шарика
		// TODO Auto-generated method stub
		System.out.println("You turned, but there is no quater");
	}
	
	@Override
	public void dispense() {                                      // Шарик выдаеться только за монетку
		// TODO Auto-generated method stub
		System.out.println("You need to play first");
	}

	
}
