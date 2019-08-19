package headFirstPatternIterator;

public class MenuTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu pancaceHouseItem = new PancaceHouseItem();
		Menu dinnerMenu = new DinnerMenu();
		Menu cafeMenu = new CafeMenu();
		
		
		
		Waitress waitress = new Waitress(pancaceHouseItem, dinnerMenu, cafeMenu);
		waitress.printMenu();
		waitress.

		
		
	}

}
