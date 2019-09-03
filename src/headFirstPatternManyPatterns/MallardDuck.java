package headFirstPatternManyPatterns;



public class MallardDuck implements Quackable {
	
	Observable observable;                        // Каждая реализация Quackable содержит обьект Observable

	
	public MallardDuck() {                        // В конструкторе создаем обьект Observable и передаем ему ссылку на обьект MalladDuck
		// TODO Auto-generated constructor stub
		observable = new Observable(this);
	}
	
	
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
	  System.out.println("Quack");	
	}
	
	public void registerObserver(Observer observer) {         // Два метода QuackObservable Обратите внимание на делегирование 
		                                                      //  операций вспомагательному обьекту
		observable.registerObserver(observer);
	}
	
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	
	
}
