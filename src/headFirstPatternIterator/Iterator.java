package headFirstPatternIterator;

public interface Iterator {        // ЕСЛИ КОЛЛЕКЦИИЯ ПОДДЕРЖИВАЕТ ИНТЕРФЕЙС ITERATOR то создание собственого итератора не имеет смысла 

	
	boolean hasNext();    //hasNext() возвращает флаг, который указывает, остались ли в коллекции елементы для перебора
	Object next();        // возвращает следующий елемент
	
}
