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
	public boolean hasNext() {                                        // ����� hasNext() ���������� true ���� � ������� ��� �������� �������� ��� �������� 
		// TODO Auto-generated method stub                            
		if(position >= items.length || items[position] == null) {    //  ��� ��� ��� ���� ������ ������� ������ ������������� ������� ����� ��������� �� ������  
			return false;                                            // ���������� ������� �������, �� � ��������� ���������� �������� �� null(������� ����������
		}else {                                                      // ��������)
			return true;	
		}
		
	}
	
	
}
