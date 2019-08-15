package headFirstPatternIterator;

public class Waitress {

 	PancaceHouseItem pancaceHouseItem;
 	DinnerMenu dinnerMenu;
	
 	
 	
 	public Waitress(PancaceHouseItem pancaceHouseItem, DinnerMenu dinnerMenu) {  // � ������������ ����������� ��� ������� ����
		// TODO Auto-generated constructor stub
 		this.pancaceHouseItem = pancaceHouseItem;
 		this.dinnerMenu = dinnerMenu;
	}
 	
 	
    public void printMenu() {                                          // ����� printMenu() ������ ������� ��� ���������  
                                                                       // �� ������ ��� ������ ���� 	
    	Iterator pancaceIterator  = pancaceHouseItem.createIterator();
    	Iterator dinnerIterator = dinnerMenu.createIterator();
    	
    	System.out.println("MENU\n-------\nBREAKFAST");
    	printMenu(pancaceIterator);                                   // � �� ��� �������� ������������ ����� printMenu() ��� ������� ���������
    	System.out.println("\nLUNCH");                                
    	printMenu(dinnerIterator);
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
