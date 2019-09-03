package patternDecorator;

public class Soy  extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ",Soy";
	}
	


	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = beverage.cost();
		if(getSize() == beverage.GRADLE) {
			cost = cost + 10;
		}else if(getSize() == beverage.GRADLE){
			cost = cost + 15;
			
		}else if(getSize() == beverage.VENTI) {
			cost = cost + 20;
		}
		
		
		
		return cost;
	}
	
}
