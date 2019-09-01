package headFirstPatternMVC;

public class DuckSimulator {

	public static void main(String []args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();       // ������� ������� ������� ������� ����� ������������ ������ simulate()
		
		
		simulator.simulate(duckFactory);
	}
	
	
	public void simulate(AbstractDuckFactory duckFactory) {               // ����� simulate() �������� AbstractDuckFactory � ����������                      
		Quackable mallardDuck = duckFactory.createMallardDuck();          // ������� ��� �������� ���� (������ ����������������� ��������   
		Quackable redheadDuck = duckFactory.createRedheadDuck();          // ����������     
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());    
		System.out.println("\nDuck Simulator: With AbstractFactory");
		
		
		Flock flockOfDucks = new Flock();                             // ������� ������ Flock � ��������� ��� ������������ Quackable
		
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
	
		Flock flockOfMallards = new Flock();                         // ����� ������� ����� ������ Flock �������������� ������ ��� ������
		
		Quackable mallardOne = duckFactory.createMallardDuck();      // ������� ��������� ��������
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);                          // ���� ������ ������������ � �������� ����
		
		/*simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);*/
		
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);                                               // ������� ��������� ��� ����
		
		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);                                           // ������ ������ ���� ������
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	
	
	
	}
	
	public void simulate(Quackable duck) {
		duck.quack();
	}
	
}
