package headfirstPatternFactoryPartTwo;

public class PizzaNY {

    NYPizzaFactory nyFactory = new NYPizzaFactory();
    PizzaStore nyStore = new PizzaStore(nyFactory);
    nyStore.order("Veggie");
	
	
    

    ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
    PizzaStore nyStore = new PizzaStore(chicagoFactory);
    nyStore.order("Veggie");
    
    
}
