package headFirstPatternManyPatterns;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {                   //  аждый метод упаковывает Quackable в декоратор.
		// TODO Auto-generated method stub                   // ѕрограмма этого не замечает: она получает то что ей нужно, т.е.
		return new QuackCounter(new MallardDuck());          // реализацию Quckuble. Ќо теперь ученые могут быть твердо уверены                  
	}                                                        // в том что каждый кр€к будет подсчитан
	
	@Override
	public Quackable createRedheadDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new RedheadDuck());
	}
	
	@Override
	public Quackable createDuckCall() {
		// TODO Auto-generated method stub
		return new QuackCounter(new DuckCall());
	}
	
	@Override
	public Quackable createRubberDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new RubberDuck());
	}


	
	
}
