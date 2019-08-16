package headFirstPatternIterator;

import java.util.Iterator;
                                      //����� Iterator ��� ��� ������� �� ������������ ��������, ���������� �������� ���� ����������
public class DinnerMenu implements Menu{

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	
	MenuItem[] menuItems;                 // ��� ������ ������ ������ �� ���������� ������ Array, ����� ���������� ������������ ������ ����,
	                                      // � ������� ��������� ������������� ��� �������������� ����
	
	
	public DinnerMenu() {
		// TODO Auto-generated constructor stub
		
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegeterian BLT" , "Bacon with lettuce", true , 2.99);
	    addItem("BLT" , "Bacon with lettuce & tomato on whole wheat", false , 2.99);
	    addItem("Soup of the day","Soup of the day, with a side of potato salad" ,true , 3.49);
	    addItem("HotDog", " HotDog with with cheese" ,false , 3.05);
		
		
		
		
	}
	
public void addItem(String name, String description, boolean vegetarian, double price) { // ����� addItem() �������� ��� ��������� ����������� ��� ��������
		                                                                                 // MenuItem � ������� ������. �� ����� ���������, �� �������� �� ����� ������ 
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);          //������������ ������ �������
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry menu is full ! Can`t add item to menu"); //��� ������������ ���� �������� ��� �� �� ���������� ������� ����� ��������
		}else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
		
		
		
	}

    /*public MenuItem [] getMenuItems() {
    	return menuItems;
    }*/

   //   public Iterator createIterator() {                // ����� createIterator() ������� ����� DinnerMenuIterator ��� ������� menuItems 
   // 	  return new DinnerMenuIterator(menuItems);     // � ���������� ��� ������� 
   //   }                                                 
                                                        // ����� ��������� ��������� Iterator.������� �� ����� ����� �� �� ��� ��������� 
                                                        // menuItems ��������� � DinnerMenu, �� �� ��� ���������� DinnerMenuIterator.������
                                                        // ������ ���������� �������� ��� �������� ���������
       @Override
       	public Iterator createIterator() {
       		// TODO Auto-generated method stub
       		return new DinnerMenuIterator(menuItems);
                   
       
       
       }	



}
