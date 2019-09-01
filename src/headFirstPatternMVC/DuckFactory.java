package headFirstPatternMVC;

public class DuckFactory extends AbstractDuckFactory {
	
	@Override
	public Quackable createMallardDuck() {                  //  аждый метод создает продукт: конкретную разновидность утки.
		// TODO Auto-generated method stub                  // ѕрограмма не знает фактический клас создаваемого продукта - ей
		return new MallardDuck();                           // известно лишь то, что создаетьс€ реализаци€ Quackble
	}
	
	@Override
	public Quackable createRedheadDuck() {
		// TODO Auto-generated method stub
		return new RedheadDuck();
	}
	
	@Override
	public Quackable createDuckCall() {
		// TODO Auto-generated method stub
		return new DuckCall();
	}
	
	@Override
	public Quackable createRubberDuck() {
		// TODO Auto-generated method stub
		return new RubberDuck();
	}

	
	
	
}
