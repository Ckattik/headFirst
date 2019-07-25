package headfirst_Pattern_Factory;

public class Test {

	public static void main(String [] args) {
		
		PizzaStore nyPizzaStore = new NYStalePizzaStore();
		
		nyPizzaStore.createPizza("cheese");
		
		
		
		
	}
	
	
}
