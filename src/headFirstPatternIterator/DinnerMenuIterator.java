package headFirstPatternIterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {

	MenuItem [] items;
	
	int position = 0;
	
	public DinnerMenuIterator(MenuItem [] items) {
		// TODO Auto-generated constructor stub
		
		this.items = items;
	}
	
	@Override
	public Object next() {
		// TODO Auto-generated method stub
	       MenuItem menuItem =  items[position];
	       position = position + 1;
		
		return menuItem;
	}
	
	
	@Override
	public boolean hasNext() {                                        // метод hasNext() возвращает true если в массиве еще остались елементы для перебора 
		// TODO Auto-generated method stub                            
		if(position >= items.length || items[position] == null) {    //  Так как для меню бистро выделен массив максимального размера нужно проверить не только  
			return false;                                            // достижение границы массива, но и равенство следующего елемента на null(признак последнего
		}else {                                                      // елемента)
			return true;	
		}
		
	}
	
	
}
