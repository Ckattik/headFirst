package headFirstFactoryThrree;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies [] veggies;
	Cheese cheese;
	Papperoni papperoni;
	Calms calm;
	
	abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350 ");
	}
    
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
		
	}
	
	public void box() {
		System.out.println("Place the pizza in oficcial PizzaStore box");
		
	}
	
	public String setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		
		return name;
	}
	
	public String toString() {
		//////////////////////.......................
	}
}
