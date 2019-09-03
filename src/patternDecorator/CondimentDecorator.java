package patternDecorator;

public class CondimentDecorator extends Beverage{         // Обьекты должны быть взаимо заменяемые с Beverage поэтому разширяем класс Beverage

	
	
	
	@Override
public double cost() {
	// TODO Auto-generated method stub
	return 0;
}
//	public abstract String getDescription() ;       //Также все декораторы должны заново реализовать метод getDesription()
	
	
		public int getSize() {
			// TODO Auto-generated method stub
			return 0;
		}
	
}
