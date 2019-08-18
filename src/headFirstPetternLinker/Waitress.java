package headFirstPetternLinker;

import java.util.*;

public class Waitress {

	MenuComponent allMenus;

	
	public Waitress(MenuComponent allMenus) {         //�������� ��������� ���� �������� ������ - ���, ������� �������� ��������� Menu 
 		// TODO Auto-generated constructor stub       // �� ������� ��� allMenus
	 this.allMenus = allMenus;
	}
	
	
	public void printMenu() {                        // � ��� �� ������� ��� �������� ���� - ��� ���� � ��� �� �������� - ���������� ������� ����� 
		allMenus.print();                            // print()  ��� ���� �������� ������
	}
	
	
	
	public void printVegeterianMenu() {
		Iterator iterator = allMenus.createIterator();
		System.out.println("\nVEGETERIAN MENU\n ------");
		
		
		while(iterator.hasNext()) {                                        //������� ���� ��������� ���������� 
			MenuComponent menuComponent = (MenuComponent)iterator.next();
		   try{
			   if(menuComponent.isVegetarian()){                           // ��� ������� �������� ����������� ����� isVegeterian(), � ���� �� 
				   menuComponent.print();                                  // ���������� true ��� �������� ����������� ����� print()
			   }
		   }catch(UnsupportedOperationException e) {                       // ����� print() ����������� ������ ��� MenuItem() � ������� ��� ���������� 
			                                                               // ��������� isVegeterian() ��� Menu ������ ���������� ����������.
		   }                                                               // ���� ��� ���������� �� ������������� ���������� � ���������� ������� 
		
		
		
		}
		
		
	}
	
}
