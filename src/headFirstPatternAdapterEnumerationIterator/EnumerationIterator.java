package headFirstPatternAdapterEnumerationIterator;

import java.util.Iterator;
import java.util.Enumeration;

public class EnumerationIterator implements Iterator {   //Чтобы адаптер воспринимался клиентским кодом как итератор, 
	                                                     // он реализует интерфейс Iterator
    Enumeration enu;
    
    
    public EnumerationIterator(Enumeration enu) {        //Адаптируемый обьект Enumeration сохраняетья в переменной(композиция)
    	this.enu = enu;
    }
    
    

    @Override
    public boolean hasNext() {                        // Метод hasNext() интерфейса Iterator передает управление методу 
    	// TODO Auto-generated method stub            // hasMoreElements() иртерфейса Enumeration
    	return enu.hasMoreElements();
    }
    
    @Override
    public Object next() {                           // а метод next() интерфейса Iterator передает управление методу nextElement()
    	// TODO Auto-generated method stub
    	return enu.nextElement();
    }
    
    
    @Override
    public void remove() {                           // к сожелению метод remove() интерфейса Iterator() поддержать не удасться,
    	// TODO Auto-generated method stub           // поетому мы просто инициируем исключение 
    	Iterator.super.remove();
    }



	
	
}
