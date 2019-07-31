package headFirstFactoryThrree;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPapperoni();
	public Clams createClam();
	
	
	
}
