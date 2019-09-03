package headFirstPatternManyPatterns;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {                   // ������ ����� ����������� Quackable � ���������.
		// TODO Auto-generated method stub                   // ��������� ����� �� ��������: ��� �������� �� ��� �� �����, �.�.
		return new QuackCounter(new MallardDuck());          // ���������� Quckuble. �� ������ ������ ����� ���� ������ �������                  
	}                                                        // � ��� ��� ������ ���� ����� ���������
	
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
