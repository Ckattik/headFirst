package headFirstPatternManyPatterns;



public class GooseAdapter implements Quackable{
	Goose goose;
	Observable observable;
	
	public GooseAdapter(Goose goose) {
		// TODO Auto-generated constructor stub
		this.goose = goose;
		observable = new Observable(this);
	}
	
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
		notifyObservers();
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
