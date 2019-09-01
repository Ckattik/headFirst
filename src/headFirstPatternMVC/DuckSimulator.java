package headFirstPatternMVC;

public class DuckSimulator {

	public static void main(String []args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();       // Сначала создаем фабрику которая будет передаваться методу simulate()
		
		
		simulator.simulate(duckFactory);
	}
	
	
	public void simulate(AbstractDuckFactory duckFactory) {               // Метод simulate() получает AbstractDuckFactory и использует                      
		Quackable mallardDuck = duckFactory.createMallardDuck();          // фабрику для создания уток (вместо непосредственного создания   
		Quackable redheadDuck = duckFactory.createRedheadDuck();          // экземляров     
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());    
		System.out.println("\nDuck Simulator: With AbstractFactory");
		
		
		Flock flockOfDucks = new Flock();                             // Создаем обьект Flock и заполняем его реализациями Quackable
		
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
	
		Flock flockOfMallards = new Flock();                         // Затем создаем новый обьект Flock предназначеный только для кряков
		
		Quackable mallardOne = duckFactory.createMallardDuck();      // Создаем несколько обьектов
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);                          // Стая кряков добавляеться в основную стаю
		
		/*simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);*/
		
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);                                               // Сначала тестируем всю стаю
		
		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);                                           // Теперь только стаю кряков
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	
	
	
	}
	
	public void simulate(Quackable duck) {
		duck.quack();
	}
	
}
