package headFirstPetternLinker;

public class TestDriveMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuComponent pankaceHouseMenu = new Menu("PANKACE HOUSE MENU", "Breakfast");  // Сначала создаем все обьекты меню
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Diner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");          // Также нам понадобиться меню верхнего уровня 
		                                                                               // назовем его allMenus
		allMenus.add(pankaceHouseMenu);                               
		allMenus.add(dinerMenu);                                                       // Для включения каждого Menu d allMenus используеться
		allMenus.add(cafeMenu);                                                        // комбинационный метод add()
		
		
		dinerMenu.add(new MenuItem("Pasta", "Spagetti", true, 3.89));
		
		
		dinerMenu.add(dessertMenu);                                                    // В меню также включаеться другое меню. Для dinerMenu важно 
		dessertMenu.add(new MenuItem("Apple pie", "Vanilla icecream",true, 1.59));     // только то, что все хранящиеся в нем обьекты являються 
		                                                                               // MenuComponent
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		
	}

}
