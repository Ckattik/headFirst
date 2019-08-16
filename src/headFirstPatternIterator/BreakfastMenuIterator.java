package headFirstPatternIterator;

import java.util.ArrayList;
import java.util.Iterator;

// ��� ������ � ���� ������ ��� ��� ArrayList ������������ iterator()


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
		if(position >= menuItems.size() || menuItems.get(position) == null) {    //  ��� ��� ��� ���� ������ ������� ������ ������������� ������� ����� ��������� �� ������  
			return false;                                            // ���������� ������� �������, �� � ��������� ���������� �������� �� null(������� ����������
		}else {                                                      // ��������)
			return true;	
		}
		
		
	}
}
