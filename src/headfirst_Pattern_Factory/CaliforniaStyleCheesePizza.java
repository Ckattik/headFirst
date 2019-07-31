package headfirst_Pattern_Factory;

public class CaliforniaStyleCheesePizza extends Pizza {
	
public CaliforniaStyleCheesePizza() {
		
		name = "California Cheese Pizza";
		dough = "Dough";
		sauce = "Ancle Bens Sauce ";
		
		
		toppings.add("Shredded Camamber Cheese");
		
		
		
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into triangle slices");
	}


	
	
	
}
