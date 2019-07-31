package headfirst_Pattern_Factory;

public class PizzaTestDrive {

	public static void main(String [] args) {
		
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	    pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		
		
	}
	
	
}
