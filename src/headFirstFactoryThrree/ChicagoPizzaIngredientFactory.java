package headFirstFactoryThrree;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	
	@Override
	public Dough createDough() {
	
		   return new ThickCrustDough();
		
		}
	
	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
	
		return new PlumTomatSauce();
		
	
	}
	
	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return MozzarellaCheese();
	}
	
	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies veggies [] = { new BlackOlives(),
				               new Spinach(),
				               new Eggplant()};
		
		
		return veggies;
	}
	
	@Override
	public Pepperoni createPapperoni() {
		// TODO Auto-generated method stub
		return new SlicePapperoni();
	}
	
	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return FrozenClams();
	}

}
