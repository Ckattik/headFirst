package headFirstPatternIterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{            

	Hashtable menuItems = new Hashtable();    // Меню кафе храниться в колекции HashTable. Поддерживает ли эта коллекция итератор скоро узнаем  
	
	public CafeMenu() {
		// TODO Auto-generated constructor stub
	    
		addItem("HashTable K&B`s Pancake Breakfast" , "Pancekes with scrambled eggs, and toast", true , 2.99);
	       addItem("HashTable Regular Pancake Breakfast" , "Pancekes with fried eggs, sausage", false , 2.99);
	       addItem("HashTable Blueberry Pancakes" , "Pancekes made with fresh bluberries", true , 3.49);
	       addItem("HashTable Waffles, with your choice of Blueberries or strawberries", "Cackes" ,true , 2.99);
		
	
	
	
	}
	
	
	
      public void addItem(String name, String description, boolean vegetarian, double price) {
		
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);          //Чтобы добавить новый елемен меню Лу создает
		menuItems.put(menuItem.getName(), menuItem);                              // menuItem.getName() - КЛЮЧ - название елемента меню 
		                                                                          // menuItem - ЗНАЧЕНИЕ -обьект menuItem
	}
	
	
	@Override
	public Iterator createIterator() {               // value() - получаем набор значений для HashTable() который представляет собой коллекцию
 		// TODO Auto-generated method stub           // всех обьектов в таблице
		return (Iterator) menuItems.values().iterator();        // к счастью коллекция поддерживает метод iterator(), возвращающий обьект типа  
	}                                                // java.Util.Iterator
	
	
}
