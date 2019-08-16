package headFirstPatternIterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{            

	Hashtable menuItems = new Hashtable();    // ���� ���� ��������� � �������� HashTable. ������������ �� ��� ��������� �������� ����� ������  
	
	public CafeMenu() {
		// TODO Auto-generated constructor stub
	    
		addItem("HashTable K&B`s Pancake Breakfast" , "Pancekes with scrambled eggs, and toast", true , 2.99);
	       addItem("HashTable Regular Pancake Breakfast" , "Pancekes with fried eggs, sausage", false , 2.99);
	       addItem("HashTable Blueberry Pancakes" , "Pancekes made with fresh bluberries", true , 3.49);
	       addItem("HashTable Waffles, with your choice of Blueberries or strawberries", "Cackes" ,true , 2.99);
		
	
	
	
	}
	
	
	
      public void addItem(String name, String description, boolean vegetarian, double price) {
		
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);          //����� �������� ����� ������ ���� �� �������
		menuItems.put(menuItem.getName(), menuItem);                              // menuItem.getName() - ���� - �������� �������� ���� 
		                                                                          // menuItem - �������� -������ menuItem
	}
	
	
	@Override
	public Iterator createIterator() {               // value() - �������� ����� �������� ��� HashTable() ������� ������������ ����� ���������
 		// TODO Auto-generated method stub           // ���� �������� � �������
		return (Iterator) menuItems.values().iterator();        // � ������� ��������� ������������ ����� iterator(), ������������ ������ ����  
	}                                                // java.Util.Iterator
	
	
}
