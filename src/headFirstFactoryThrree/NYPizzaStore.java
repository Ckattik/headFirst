package headFirstFactoryThrree;

public class NYPizzaStore extends PizzaStore {

	
	
	
	
	@Override
	Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		//Pizza pizza = null;
		 
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		
		 
		 
		 
		if(item.equals("cheese")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}else if(item.equals("veggie")){
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York Style Veggie Pizza");
			
			
		}else if(item.equals("calm")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York Style Calm Pizza");
		}else if(item.equals("papperoni")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York Style Papperoni Pizza");
		}
		
		
		
		
		
		
		
		
		return pizza;
	}
}
