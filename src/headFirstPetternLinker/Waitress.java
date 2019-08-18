package headFirstPetternLinker;

import java.util.*;

public class Waitress {

	MenuComponent allMenus;

	
	public Waitress(MenuComponent allMenus) {         //Передаем компонент меню верхнего уровня - тот, который содержит остальные Menu 
 		// TODO Auto-generated constructor stub       // мы назвали его allMenus
	 this.allMenus = allMenus;
	}
	
	
	public void printMenu() {                        // А что бы вывести всю иерархию меню - все меню и все их елементы - достаточно вызвать метод 
		allMenus.print();                            // print()  для меню верхнего уровня
	}
	
	
	
	public void printVegeterianMenu() {
		Iterator iterator = allMenus.createIterator();
		System.out.println("\nVEGETERIAN MENU\n ------");
		
		
		while(iterator.hasNext()) {                                        //Перебор всех елементов комбинации 
			MenuComponent menuComponent = (MenuComponent)iterator.next();
		   try{
			   if(menuComponent.isVegetarian()){                           // Для каждого елемента вызываеться метод isVegeterian(), и если он 
				   menuComponent.print();                                  // возвращает true для елемента вызываеться метод print()
			   }
		   }catch(UnsupportedOperationException e) {                       // Метод print() вызываеться только для MenuItem() и никогда для комбинации 
			                                                               // релизация isVegeterian() для Menu всегда генерирует изключение.
		   }                                                               // Если это произойдет мы перехватываем исключение и продолжаем перебор 
		
		
		
		}
		
		
	}
	
}
