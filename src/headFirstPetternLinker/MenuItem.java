package headFirstPetternLinker;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	
	String name;
	String description;
	boolean vegeterian;
	double price;
	
	//Iterator iterator = null;	
	
	public MenuItem(String name, String description, boolean vegeterian, double price) { // ������ MenuItem �������� ��������� �����:���,
		// TODO Auto-generated constructor stub                                          // ��������, ���� ��������������� ����� � ����.
		this.name = name;                                                                // ��� ��� �������� ����������� ������������ ��� �������������
		this.description = description;                                                  // ������� MenuItem
		this.vegeterian = vegeterian;
		this.price = price;
	}
	
	
	
	public Iterator createIterator() {
		return new NullIterator();
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public boolean isVegeterian() {
		return vegeterian;
	}
	
	public double getPrice() {
		return price;
	}
	
    @Override
    public void print() {                       // � ���� ����� ����������� �� ���������� ����������.�� �������������� ����� print() ������ 
    	// TODO Auto-generated method stub      // MenuComponent. ��� MenuItem() ���� ����� ������� ������ �������� �������� ���� :��������,
    	System.out.print(" " + getName());      // ��������, ���� � ������� ��������������� �����
    	if(isVegeterian()) {
    		System.out.print(" (v) ");
    	}
    	
    	System.out.println(", " + getPrice());
    	System.out.println("   -- " + getDescription());
    }

}
