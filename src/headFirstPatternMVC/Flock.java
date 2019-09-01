package headFirstPatternMVC;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{

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
	
	
}
