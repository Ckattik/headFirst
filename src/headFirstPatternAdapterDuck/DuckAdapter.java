package headFirstPatternAdapterDuck;

public class DuckAdapter implements Turkey {
	
	Duck duck;
	
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		duck.fly();
		
		
	}
	
	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		duck.quack();
	}

}
