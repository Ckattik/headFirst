package headFirstPatternManyPatterns;

import java.util.ArrayList;
import java.util.Iterator;


/* Класс Observable реализует все функциональность необходимую 
   * Quackble для наблюдения  
   * Класс Observable должен реализовать  QuackObservable
   */


 public class Observable  implements QuackObservable{
	 
	 ArrayList observers = new ArrayList();
	 QuackObservable duck;
	 
	 public Observable(QuackObservable duck) {     // Конструктору передаеться обьект QuackObservable, который используеться им для 
		// TODO Auto-generated constructor stub    // управления наблюдателем. Посмотрите на приведенный ниже метод notify() при оповещении 
		 this.duck = duck;                         // Observable передает этот обьект, что бы наблюдатель знал в каком обьекте произошло
	}                                              // наблюдаемое событие
	 
	 
	 @Override
	public void registerObserver(Observer observer) {     // Код регистрации наблюдателя
		// TODO Auto-generated method stub
		 observers.add(observer);
		 
	}
	 
	 
	 @Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		 Iterator iterator = observers.iterator();
		while(iterator.hasNext()) {                               // Код оповещения
			Observer observer = (Observer)iterator.next();
			observer.update(duck);
			
		}
	}
	 

}
