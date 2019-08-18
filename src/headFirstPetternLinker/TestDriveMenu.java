package headFirstPetternLinker;

public class TestDriveMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuComponent pankaceHouseMenu = new Menu("PANKACE HOUSE MENU", "Breakfast");  // ������� ������� ��� ������� ����
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Diner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");          // ����� ��� ������������ ���� �������� ������ 
		                                                                               // ������� ��� allMenus
		allMenus.add(pankaceHouseMenu);                               
		allMenus.add(dinerMenu);                                                       // ��� ��������� ������� Menu d allMenus �������������
		allMenus.add(cafeMenu);                                                        // �������������� ����� add()
		
		
		dinerMenu.add(new MenuItem("Pasta", "Spagetti", true, 3.89));
		
		
		dinerMenu.add(dessertMenu);                                                    // � ���� ����� ����������� ������ ����. ��� dinerMenu ����� 
		dessertMenu.add(new MenuItem("Apple pie", "Vanilla icecream",true, 1.59));     // ������ ��, ��� ��� ���������� � ��� ������� ��������� 
		                                                                               // MenuComponent
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		
	}

}
