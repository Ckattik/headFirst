package headFirstPatternManyPatterns;


/* Наблюдатель должен реализовать интерфейс Observer
 * иначе его не удасться зарегестрировать с QuackObserveble
 */



public class Quackologolist implements Observer {
                                                     // Класс наблюдателя прост единственный метод update() выводит
	                                                 // информацию о реализации Quackable от которой поступило оповещение
	
	@Override                                                       
	public void update(QuackObservable duck) {
		// TODO Auto-generated method stub
		System.out.println("Quackologist: " + duck + "just quacked.");
	}
}
