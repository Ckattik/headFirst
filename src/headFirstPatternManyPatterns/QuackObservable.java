package headFirstPatternManyPatterns;



public interface QuackObservable {                    // Чтобы за Quackable можно было наблюдать они должны реализовать интерфейс QuackObservable
	
	public void registerObserver(Observer observer); // Метод регистрации наблюдателей.Любой обькт реализующий интерфейс Observer
                                                     // сможет получать оповещения 
	public void notifyObservers();                   // Также имееться метод оповещения наблюдателей
	
	
}
