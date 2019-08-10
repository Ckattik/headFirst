package headFirstPatternAdapterDuck;


public class TurkeyTestDrive {

	public static void main(String [] args) {
		
		WildTurkey turkey = new WildTurkey();
        
		
		
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);       // Turkey �������������� � TurkeyAdapter � �������� ��������� ��� Duck 
		
		System.out.println("The Duck says ...");           // ��������� ������ Duck
		duck.quack();
		duck.fly();

		System.out.println();
		
		System.out.println("\n The Turkey says ...");           //������ �������� ����� testDuck(),������ �������� ������ Duck
		testTurkey(turkey);
		
		System.out.println("\n The DuckAdapter says ...");
		testTurkey(duckAdapter);
		
		
	}
	static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
		
	}

        		
		
		
	}
	
	
	

