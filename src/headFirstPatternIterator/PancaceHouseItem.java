package headFirstPatternIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancaceHouseItem implements Menu{         //���������� ���� �������
        ArrayList menuItems;
        
	public PancaceHouseItem() {
		// TODO Auto-generated constructor stub
	
	   menuItems = new ArrayList();             //�� ������ �������� ���� ArrayList
	
       addItem("K&B`s Pancake Breakfast" , "Pancekes with scrambled eggs, and toast", true , 2.99);
       addItem("Regular Pancake Breakfast" , "Pancekes with fried eggs, sausage", false , 2.99);
       addItem("Blueberry Pancakes" , "Pancekes made with fresh bluberries", true , 3.49);
       addItem("Waffles, with your choice of Blueberries or strawberries", "Cackes" ,true , 2.99);
	
	
	
	}
	
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);          //����� �������� ����� ������ ���� �� �������
		menuItems.add(menuItem);
	}
	
	/*public ArrayList getMenuItems()  {      //����� getMenuItems() ���������� ������ ��������� ����
		 
		return menuItems;
	}*/
	
                 
  	     
      
    @Override
    	public Iterator createIterator() {                               // ����� createIterator() ������� ����� BreakfastMenuIterator ��� ������� menuItems 
    		// TODO Auto-generated method stub                             // � ���������� ��� �������  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    	//	return new BreakfastMenuIterator(menuItems);
    	     return menuItems.iterator();
    	}
    
	
}
