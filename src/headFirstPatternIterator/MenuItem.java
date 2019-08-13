package headFirstPatternIterator;

public class MenuItem {

	String name;
	String description;
	boolean vegeterian;
	double price;
	
	public MenuItem(String name, String description, boolean vegeterian, double price) { // ������ MenuItem �������� ��������� �����:���,
		// TODO Auto-generated constructor stub                                          // ��������, ���� ��������������� ����� � ����.
		this.name = name;                                                                // ��� ��� �������� ����������� ������������ ��� �������������
		this.description = description;                                                  // ������� MenuItem
		this.vegeterian = vegeterian;
		this.price = price;
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
	
	
}
