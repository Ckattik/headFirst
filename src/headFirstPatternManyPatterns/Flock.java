package headFirstPatternManyPatterns;

import java.util.ArrayList;
import java.util.Iterator;


public class Flock implements Quackable{

	Observable observable;
	
	
	ArrayList quackers = new ArrayList();                // Каждая стая (Flock) содержит ArrayList для хранения реализациq Quackable 
	                                                     // входящих в эту стаю
	public void add(Quackable quacker) {                 // Метод add() включает реализацию Quackable в Flock
		quackers.add(quacker);
	}
	
	public void quack() {
		Iterator iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable quacker = (Quackable)iterator.next();
			quacker.quack();                                 // Теперь метод quack() - в конце концов, Flock тоже являеться реализацией 
			                                                 // Quackable. Метод quack() для обьекта Flock должен применяться ко всем уткам стаи
		}                                                    // Мы перебираем ArrayList и вызываем quack() для каждого елемента
	}
	
	@Override
	public void registerObserver(Observer observer) {       // При регистрации Flock как наблюдателя автоматически регистрируеться все  
		// TODO Auto-generated method stub                  // что содержиться во Flock - тоесть все реализации Quackable будь то Duck 
		Iterator iterator = quackers.iterator();            // или другой обьект Flock
		while(iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();    // Перебираем все реализации Quackables в Flock и делегируем вызов каждому обьекту 
			duck.registerObserver(observer);                // Если реализация Quackable представляет собой Flock то же самое происходит на следующем 
		}                                                   // уровне
		
		
	}
	
	@Override
	public void notifyObservers() {                         // Каждая реализация Quackable Выполняет оповещение самостоятельно поетому Flock
		// TODO Auto-generated method stub                  // Нечего делать не прийдеться 
		
	}
}
