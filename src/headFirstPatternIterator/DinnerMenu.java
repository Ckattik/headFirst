package headFirstPatternIterator;

import java.util.Iterator;
                                      //Нужен Iterator так как масиввы не поддерживают итератор, прийдеться написать свой собственый
public class DinnerMenu implements Menu{

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	
	MenuItem[] menuItems;                 // Мел выбрал другой подход он использует массив Array, чтобы ограничить максимальный размер меню,
	                                      // а выборка елементов производилась без преобразования типа
	
	
	public DinnerMenu() {
		// TODO Auto-generated constructor stub
		
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegeterian BLT" , "Bacon with lettuce", true , 2.99);
	    addItem("BLT" , "Bacon with lettuce & tomato on whole wheat", false , 2.99);
	    addItem("Soup of the day","Soup of the day, with a side of potato salad" ,true , 3.49);
	    addItem("HotDog", " HotDog with with cheese" ,false , 3.05);
		
		
		
		
	}
	
public void addItem(String name, String description, boolean vegetarian, double price) { // Метод addItem() получает все параметры необходимые для создания
		                                                                                 // MenuItem и создает обьект. Он также проверяет, не нарушает ли новый обьект 
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);          //максимальный размер массива
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry menu is full ! Can`t add item to menu"); //Мел ограничивает меню рецептов что бы не запоминать слишком много рецептов
		}else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
		
		
		
	}

    /*public MenuItem [] getMenuItems() {
    	return menuItems;
    }*/

   //   public Iterator createIterator() {                // метод createIterator() создает обькт DinnerMenuIterator для массива menuItems 
   // 	  return new DinnerMenuIterator(menuItems);     // и возвращает его клиенту 
   //   }                                                 
                                                        // Метод возвращат интерфейс Iterator.Клиенту не нужно знать ни то как коллекция 
                                                        // menuItems храниться в DinnerMenu, не то как реализован DinnerMenuIterator.Клиент
                                                        // просто использует итератор для перебора елементов
       @Override
       	public Iterator createIterator() {
       		// TODO Auto-generated method stub
       		return new DinnerMenuIterator(menuItems);
                   
       
       
       }	



}
