package headFirstPatternIterator;

public class Waitress {

 	PancaceHouseItem pancaceHouseItem;
 	DinnerMenu dinnerMenu;
	
 	
 	
 	public Waitress(PancaceHouseItem pancaceHouseItem, DinnerMenu dinnerMenu) {  // В конструкторе передаються два обьекта меню
		// TODO Auto-generated constructor stub
 		this.pancaceHouseItem = pancaceHouseItem;
 		this.dinnerMenu = dinnerMenu;
	}
 	
 	
    public void printMenu() {                                          // Метод printMenu() теперь создает два итератора  
                                                                       // по одному для каждоо меню 	
    	Iterator pancaceIterator  = pancaceHouseItem.createIterator();
    	Iterator dinnerIterator = dinnerMenu.createIterator();
    	
    	System.out.println("MENU\n-------\nBREAKFAST");
    	printMenu(pancaceIterator);                                   // А за тем вызываем перегруженый метод printMenu() для каждого итератора
    	System.out.println("\nLUNCH");                                
    	printMenu(dinnerIterator);
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
