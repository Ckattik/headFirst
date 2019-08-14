package headFirstPatternIterator;

import java.util.ArrayList;

public class PancaceHouseItem {         //Реализация меню блинной
        ArrayList menuItems;
        
	public PancaceHouseItem() {
		// TODO Auto-generated constructor stub
	
	   menuItems = new ArrayList();             //Лу хранит елементы меню ArrayList
	
       addItem("K&B`s Pancake Breakfast" , "Pancekes with scrambled eggs, and toast", true , 2.99);
       addItem("Regular Pancake Breakfast" , "Pancekes with fried eggs, sausage", false , 2.99);
       addItem("Blueberry Pancakes" , "Pancekes made with fresh bluberries", true , 3.49);
       addItem("Waffles, with your choice of Blueberries or strawberries", "Cackes" ,true , 2.99);
	
	
	
	}
	
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);          //Чтобы добавить новый елемен меню Лу создает
		menuItems.add(menuItem);
	}
	
	/*public ArrayList getMenuItems()  {      //Метод getMenuItems() возвращает список елементов меню
		 
		return menuItems;
	}*/
	
    public Iterator createIterator() {                // метод createIterator() создает обькт BreakfastMenuIterator для массива menuItems 
  	  return new BreakfastMenuIterator(menuItems);     // и возвращает его клиенту  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }  
	
}
