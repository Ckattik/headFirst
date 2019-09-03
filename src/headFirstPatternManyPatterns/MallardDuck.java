package headFirstPatternManyPatterns;



public class MallardDuck implements Quackable {
	
	Observable observable;                        // ������ ���������� Quackable �������� ������ Observable

	
	public MallardDuck() {                        // � ������������ ������� ������ Observable � �������� ��� ������ �� ������ MalladDuck
		// TODO Auto-generated constructor stub
		observable = new Observable(this);
	}
	
	
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
	  System.out.println("Quack");	
	}
	
	public void registerObserver(Observer observer) {         // ��� ������ QuackObservable �������� �������� �� ������������� 
		                                                      //  �������� ���������������� �������
		observable.registerObserver(observer);
	}
	
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	
	
}
