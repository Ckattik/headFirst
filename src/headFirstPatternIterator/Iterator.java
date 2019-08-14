package headFirstPatternIterator;

public interface Iterator {

	
	boolean hasNext();    //hasNext() возвращает флаг, который указывает, остались ли в коллекции елементы для перебора
	Object next();        // возвращает следующий елемент
	
}
