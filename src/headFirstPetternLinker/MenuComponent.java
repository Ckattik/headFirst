package headFirstPetternLinker;

import java.util.Iterator;

/* ��� ��� ���� ������ ����� ����� ������ ��� MenuItem, � ������ ������ ��� 
 * Menu, ���������� �� ��������� ���������� UnsupportedOperationException()
 * ���� ������ MenuItem ��� Menu �� ������������ ��������, ����� ����� ������ ������ 
 * �� ������ ��������� ���������� �� �������� 
 */

public abstract class MenuComponent {

		
	public void add(MenuComponent menuComponent) {     // ������ <���������������> ������� �� ���� ������� ��� ����������, �������� � ��������� 
		throw new UnsupportedOperationException();     // MenuComponent
	}
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	
	
	
	public String getName() {                           // ������ "������� ��������" ������������ MenuItem()
		throw new UnsupportedOperationException();      // ��� �� ������ ������� ��� ������� ���� Menu, �������� �� ����
	}                                                   // ������� ����� ����� �������������� � Menu
	public String getDescription() {                   
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	
	
	public void print() {                                 // ����� print() ������������ ��� � Menu ��� � � MenuItem, �� �� �������������
		throw new UnsupportedOperationException();        // ���������� �� ���������
	}
	
	public abstract Iterator createIterator();
	
	
	
	
}
