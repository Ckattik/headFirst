package headfirst_Pattern_Factory;

public class CaliforniaStylePizzaStore extends PizzaStore {

	
	@Override
	public Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		 if(item.equals("cheese")) {
			 return new CaliforniaStyleCheesePizza();
			 
	//	 }else if(item.equals("pepperoni")) {
	//		 return new CaliforniaStylePepperoniPizza();
	//	 }else if(item.equals("calm")) {
	//		 return new CaliforniaStyleCalmPizza();
	//	 }else if(item.equals("veggie")) {
	//		 return new CaliforniaStyleVeggiePizza();
		 }else return null;
		
		
		
		
		
	
	}
}
