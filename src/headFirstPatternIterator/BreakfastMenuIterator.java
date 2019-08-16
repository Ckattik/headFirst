package headFirstPatternIterator;

import java.util.ArrayList;
import java.util.Iterator;

// Ќет смысла в этом классе так как ArrayList ѕоддерживает iterator()


public class BreakfastMenuIterator implements Iterator {

	ArrayList menuItems;
	int position = 0;
	
	public BreakfastMenuIterator(ArrayList menuItems) {
		// TODO Auto-generated constructor stub
		this.menuItems = new ArrayList();
		
	}
	
	
	
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = (MenuItem)menuItems.get(position);
		
		
		return menuItem;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= menuItems.size() || menuItems.get(position) == null) {    //  “ак как дл€ меню бистро выделен массив максимального размера нужно проверить не только  
			return false;                                            // достижение границы массива, но и равенство следующего елемента на null(признак последнего
		}else {                                                      // елемента)
			return true;	
		}
		
		
	}
}
