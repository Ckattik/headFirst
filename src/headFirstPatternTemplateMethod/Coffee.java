package headFirstPatternTemplateMethod;

public class Coffee extends CaffeinBeverage{
	
	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
	
		System.out.println("Adding Sugar and Milk");
	}
	
	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dripping coffee throuth filter");
	}

}
