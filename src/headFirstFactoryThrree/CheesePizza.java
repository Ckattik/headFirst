package headFirstFactoryThrree;

public class CheesePizza extends Pizza{

	PizzaIngredientFactory pizzaIngredientFactory;
	
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	
	
	
	
	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println(" Preparing " + name);
		 dough = pizzaIngredientFactory.createDough();
		 sauce = pizzaIngredientFactory.createSauce();
		 cheese = pizzaIngredientFactory.createCheese();
	}
}
