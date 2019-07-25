package headfirst_Pattern_Factory;

public class NYStalePizzaStore extends PizzaStore {

	
	@Override
	 public Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		
		 if(item.equals("cheese")) {
			 return new NYStyleCheesePizza();
			 
		 }else if(item.equals("pepperoni")) {
			 return new NYStylePepperoniPizza();
		 }else if(item.equals("calm")) {
			 return new NYStyleCalmPizza();
		 }else if(item.equals("veggie")) {
			 return new NYStyleVeggiePizza();
		 }else return null;
			
		
		
		
	}
}
