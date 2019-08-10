package headFirstPatternAdapter;

public class DuckTestDrive {

	public static void main(String [] args) {
		
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);       // Turkey упаковываеться в TurkeyAdapter и начинает выглядеть как Duck 
		
		System.out.println("The Turkey says ...");           // Тестируем методы Turkey
		turkey.gobble();
		turkey.fly();

		System.out.println();
		
		System.out.println("\n The Duck says ...");           //Теперь вызываем метод testDuck(),которій получает обьект Duck
		testDuck(duck);
		
		System.out.println("\n The TurkeyAdapter says ...");
		testDuck(turkeyAdapter);
		
		
	}
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
		
	}
	
	
}
