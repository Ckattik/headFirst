package headfirst_Pattern_Factory;

public class ChicagoStylePizzaStore extends PizzaStore {

	
	@Override
	public Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		 if(item.equals("cheese")) {
			 return new ChicagoStyleCheesePizza();
			 
		 }else if(item.equals("pepperoni")) {
			 return new ChicagoStylePepperoniPizza();
		 }else if(item.equals("calm")) {
			 return new ChicagoStyleCalmPizza();
		 }else if(item.equals("veggie")) {
			 return new ChicagoStyleVeggiePizza();
		 }else return null;
	}
}
