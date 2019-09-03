package headFirstPatternManyPatterns;



public class QuackCounter implements Quackable{             // QuackCounter - ��������� 

	Observable observable;
	Quackable duck;                    // ���������� ��� �������� ������������� �������
	static int numberOfQuacks;          // ��� �������� ���� ������ ������������� ����������� ���������� 
	
	public QuackCounter(Quackable duck) {
		// TODO Auto-generated constructor stub
		
		this.duck = duck;                        // � ������������ �������� ������ �� ������������ ���������� Quackable
		observable = new Observable(this);
	}
	
	@Override
		public void quack() {
			// TODO Auto-generated method stub
		   duck.quack();                        // ����� quack() ������������� ������������ ����������� Quackable
		   numberOfQuacks++;                    // ����� ���� �������������� �������
		   notifyObservers();
		
		}
	
	public static int getQuacks() {           // ��������� ������������ ����������� ������� ������� ���������� ���������� ������ �� 
		return numberOfQuacks;                // ���� �����������
	}
	
	@Override
		public void registerObserver(Observer observer) {
			// TODO Auto-generated method stub
		observable.registerObserver(observer);
		}
	
	@Override
		public void notifyObservers() {
			// TODO Auto-generated method stub
		observable.notifyObservers();
		}
	
	
	
}
