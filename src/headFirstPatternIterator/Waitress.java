package headFirstPatternIterator;


import java.util.Iterator;

public class Waitress {

 	Menu pancaceHouseItem;
 	Menu dinnerMenu;
 	Menu cafeMenu;
	
 	
 	
 	public Waitress(Menu pancaceHouseItem, Menu dinnerMenu, Menu cafeMenu) {  // � ������������ ����������� ��� ������� ����
		// TODO Auto-generated constructor stub
 		this.pancaceHouseItem = pancaceHouseItem;
 		this.dinnerMenu = dinnerMenu;
 		this.cafeMenu = cafeMenu;
	}
 	
 	
    public void printMenu() {                                          // ����� printMenu() ������ ������� ��� ���������  
                                                                       // �� ������ ��� ������ ���� 	
    	Iterator pancaceIterator  = pancaceHouseItem.createIterator();
    	Iterator dinnerIterator =  dinnerMenu.createIterator();
    	Iterator cafeIterator = cafeMenu.createIterator();
    	
    	System.out.println("MENU\n-------\nBREAKFAST");
    	printMenu(pancaceIterator);                                   // � �� ��� �������� ������������ ����� printMenu() ��� ������� ���������
    	
    	System.out.println("\nLUNCH");                                
    	printMenu(dinnerIterator);
    	
    	System.out.println("\nDINNER");                                
    	printMenu(cafeIterator);
    }
    
    private void printMenu(Iterator iterator) {
    	while(iterator.hasNext()) {                                  // ��������� �������� ��� �������� 
    		MenuItem menuItem = (MenuItem)iterator.next();           // �������� ��������� �������
    	    
    		System.out.println(menuItem.getName() + " ,");
    		System.out.println(menuItem.getPrice() + " ---");
    		System.out.println(menuItem.getDescription());
    	
    	}
    	
    }
    
 	
 	
 	
 	
}
