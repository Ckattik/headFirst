package headFirstFactoryThrree;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
	
	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}
	
	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return MarinaraSouce();
	}
	
	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}
	
	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies veggies [] = {new Garlic(), new Onion(), new Mushroom()};
		
		return veggies;
	}
	
	@Override
	public Pepperoni createPapperoni() {
		// TODO Auto-generated method stub
		return new SlicedPapperoni();
	}
	
	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new FreshClams();
	}

}
