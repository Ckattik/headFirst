package headFirstPatternState;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GumballMachine gumballMachine = new GumballMachine(5); // Загружаем 5 шариков
		
		System.out.println(gumballMachine);                    // Выводим состояние автомата 
		
		gumballMachine.insertQuarter();                        // Бросаем монетку 
		gumballMachine.turnCrank();                            // Дергаем за рычаг автомат должен выдать шарик 
		
		System.out.println(gumballMachine);                    // Выводим состояние автомата 
		
		
//		gumballMachine.insertQuarter();                        //// Бросаем монетку
//		gumballMachine.ejectQuater();                          // Требуем ее обратно
//		gumballMachine.turnCrank();                            // Дергаем за рычаг , автомат не должен выдать шарик 	
	
	
//		System.out.println(gumballMachine);                    // Выводим состояние автомата
	
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();                        //// Бросаем монетку
		gumballMachine.turnCrank();                            // Дергаем за рычаг , автомат должен выдать шарик
//		gumballMachine.ejectQuater();                          // Требуем вернуть монетку которую не бросали
		
		
		System.out.println(gumballMachine);
	
/*		gumballMachine.insertQuarter();                         // Бросаем две монетки 
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
	*/	

	
	        

	
	
	
	
	
	
	}

}
