package headFirstPetternLinker;

public class MenuItem extends MenuComponent {
	
	String name;
	String description;
	boolean vegeterian;
	double price;
	
	public MenuItem(String name, String description, boolean vegeterian, double price) { // ќбьект MenuItem содержит несколько полей:им€,
		// TODO Auto-generated constructor stub                                          // описание, флаг вегетарианского блюда и цена.
		this.name = name;                                                                // ¬се эти значени€ передаютьс€ конструктору дл€ инициализации
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
	
    @Override
    public void print() {                       // ј етот метод отличаетьс€ от предидущей реализации.ћы переопредел€ем метод print() класса 
    	// TODO Auto-generated method stub      // MenuComponent. ƒл€ MenuItem() этот метод выводит полное описание елемента меню :название,
    	System.out.print(" " + getName());      // описание, цену и признак вегетарианского блюда
    	if(isVegeterian()) {
    		System.out.print(" (v) ");
    	}
    	
    	System.out.println(", " + getPrice());
    	System.out.println("   -- " + getDescription());
    }

}
