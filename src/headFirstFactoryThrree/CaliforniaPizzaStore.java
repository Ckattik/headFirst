package headFirstFactoryThrree;

public class CaliforniaPizzaStore extends PizzaStore{

	
	
	
	@Override
	Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if(item.equals("cheese")) {
			return new CaliforniaStalyCheesePizza();
		}else if(item.equals("veggie")) {
			return new CaliforniaStalyVeggiePizza();
		}else if(item.equals("clam")) {
			return new CaliforniaStalyCalmPizza();
		}else if(item.equals("papperoni")) {
			return new CaliforniaStalyPapperoniPizza();
		}else return null;
		
		
		
		
		
		
		
		
	
	}
	
	
}
