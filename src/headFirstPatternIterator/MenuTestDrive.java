package headFirstPatternIterator;

public class MenuTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PancaceHouseItem pancaceHouseItem = new PancaceHouseItem();
		DinnerMenu dinnerMenu = new DinnerMenu();
		
		Waitress waitress = new Waitress(pancaceHouseItem, dinnerMenu);
		waitress.printMenu();
		
		
	}

}
