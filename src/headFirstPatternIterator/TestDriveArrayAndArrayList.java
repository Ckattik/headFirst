package headFirstPatternIterator;

import java.util.ArrayList;

public class TestDriveArrayAndArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PancaceHouseItem pancaceHouseItem = new PancaceHouseItem();
	// # 1	ArrayList breakfastItems = pancaceHouseItem.getMenuItems();
                                                                   // ћетоды внешние похожи но вызовы возвращают разные типы 		
		DinnerMenu dinnerMenu = new DinnerMenu();
	// # 1	MenuItem [] lunchItems = dinnerMenu.getMenuItems();        // «десь про€вл€ютьс€ различи€ реализации : блюда дл€ завтрака хран€тьс€ 
		                                                           // в ArrayList, а обеденные блюда в Array
		Iterator iterator = dinnerMenu.createIterator();
		     while(iterator.hasNext()) {
		    	 MenuItem menuItem = (MenuItem)iterator.next();
		        System.out.println(menuItem.name);
		     
		     }
		     
		  Iterator iterator1 = pancaceHouseItem.createIterator();
		         while(iterator1.hasNext()) {
		        	 MenuItem menuItem1 = (MenuItem)iterator1.next();
		        	 System.out.println(menuItem1.name);
		         }
		
		
		
	/*	for(int i = 0; i < breakfastItems.size();i++) {                  // Ћопатим Array и ArrayList  # 1
			 MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			 System.out.println(menuItem.getName() + " ");
			 System.out.println(menuItem.getPrice() + " ");
			 System.out.println(menuItem.getDescription() + " ");
		}
		
		
		for(int i = 0; i < lunchItems.length; i ++) {
			MenuItem menuItem = lunchItems[i];
			System.out.println(menuItem.getName() + " ");
		    System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription() + " ");
		}*/
		
		
		
		
		
		
		
		
		

	}

}
