package headFirstPetternLinker;

public class Waitress {

	MenuComponent allMenus;

	
	public Waitress(MenuComponent allMenus) {         //�������� ��������� ���� �������� ������ - ���, ������� �������� ��������� Menu 
 		// TODO Auto-generated constructor stub       // �� ������� ��� allMenus
	 this.allMenus = allMenus;
	}
	
	
	public void printMenu() {                        // � ��� �� ������� ��� �������� ���� - ��� ���� � ��� �� �������� - ���������� ������� ����� 
		allMenus.print();                            // print()  ��� ���� �������� ������
	}
	
}
