package headFirstPatternIterator;

public class MenuItem {

	String name;
	String description;
	boolean vegeterian;
	double price;
	
	public MenuItem(String name, String description, boolean vegeterian, double price) { // Обьект MenuItem содержит несколько полей:имя,
		// TODO Auto-generated constructor stub                                          // описание, флаг вегетарианского блюда и цена.
		this.name = name;                                                                // Все эти значения передаються конструктору для инициализации
		this.description = description;                                                  // обьекта MenuItem
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
