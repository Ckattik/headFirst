package headFirstPatternIterator;


import java.util.Iterator;

public class Waitress {

 	Menu pancaceHouseItem;
 	Menu dinnerMenu;
 	Menu cafeMenu;
	
 	
 	
 	public Waitress(Menu pancaceHouseItem, Menu dinnerMenu, Menu cafeMenu) {  // В конструкторе передаються два обьекта меню
		// TODO Auto-generated constructor stub
 		this.pancaceHouseItem = pancaceHouseItem;
 		this.dinnerMenu = dinnerMenu;
 		this.cafeMenu = cafeMenu;
	}
 	
 	
    public void printMenu() {                                          // Метод printMenu() теперь создает два итератора  
                                                                       // по одному для каждоо меню 	
    	Iterator pancaceIterator  = pancaceHouseItem.createIterator();
    	Iterator dinnerIterator =  dinnerMenu.createIterator();
    	Iterator cafeIterator = cafeMenu.createIterator();
    	
    	System.out.println("MENU\n-------\nBREAKFAST");
    	printMenu(pancaceIterator);                                   // А за тем вызываем перегруженый метод printMenu() для каждого итератора
    	
    	System.out.println("\nLUNCH");                                
    	printMenu(dinnerIterator);
    	
    	System.out.println("\nDINNER");                                
    	printMenu(cafeIterator);
    }
    
    private void printMenu(Iterator iterator) {
    	while(iterator.hasNext()) {                                  // Проверяем остались еще елементы 
    		MenuItem menuItem = (MenuItem)iterator.next();           // Получаем следующий елемент
    	    
    		System.out.println(menuItem.getName() + " ,");
    		System.out.println(menuItem.getPrice() + " ---");
    		System.out.println(menuItem.getDescription());
    	
    	}
    	
    }
    
 	
 	
 	
 	
}
