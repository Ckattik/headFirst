package headFirstPetternLinker;

import java.util.ArrayList;
import java.util.Iterator;


public class Menu extends MenuComponent {
	
	ArrayList menuComponents = new ArrayList();  // ���� ����� ���� ����� ���������� �������� ���� MenuComponent;��� �� �������� ����� �
	String name;                                 // �������������� ��������� ��������� ArrayList
	String description;
	
	
 	public Menu(String name, String description) {  // ����������� �� ����� ������ ����������: � ������ ���� ������������ �������� � ��������
		// TODO Auto-generated constructor stub
		this.name = name;
		this.description = description;
	}
 	
 	
 	@Override
 	public void add(MenuComponent menuComponent) {   // ��������� � ���� �������� MenuItem ��� ������ �������� Menu. ��� ��� � MenuItem � 
 		// TODO Auto-generated method stub           // Menu ��������� MenuComponent ������� ������ ������ ����� ��������������� �������� �������� 
 		menuComponents.add(menuComponent);           // � ��������� MenuComponent
 	}
 	
 	@Override
 	public void remove(MenuComponent menuComponent) {
 		// TODO Auto-generated method stub
 		menuComponents.remove(menuComponent);
 	}
 	
 	@Override
 	public MenuComponent getChild(int i) {
 		// TODO Auto-generated method stub
 		return (MenuComponent)menuComponents.get(i);
 	}
	
	@Override
	public String getName() {                         // Get -������ ��� ��������� �������� � ��������.
		// TODO Auto-generated method stub            // �������� �������� �� �� �������������� getPrice() ��� isVegeterian ��������� ��� ������ 
		return name;                       // �� ����� ������ ��� ����. ���������� ������� �� ��� ���� ����� ������ ����������
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	
	
 	@Override
 	public void print() {                                        // ����� ���� �������� ����� print() ��� �� �� ������� �� ������ ���������� 
		// TODO Auto-generated method stub                       // � ����, �� � ��� ���������� : ������ ���� � �������� ����
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());             // �� ���������� �������� ��� �������� ���� ����������� ������� Menu ..
		System.out.println("-----------------");                 // ��� ����� ���� ������ ������� Menu ��� o������ MenuItem. ��� ��� � Menu 
		                                                         // � MenuItem ��������� ����� print(), �� ������ �������� print(), � ��� ��������� 
		Iterator iterator = menuComponents.iterator();           // ��� ������� ���� 
		   while(iterator.hasNext()) {
			   MenuComponent menuComponent = (MenuComponent)iterator.next();  //���� � ������� �������� �� �������� ������ ������ Menu,
			   menuComponent.print();                                         // ��� ����� print() ������ ���� ������� ���.
		   }
	}

}
