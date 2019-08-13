package headFirstPatternTemplateMethod;

public class Tea extends CaffeinBeverage{
  
	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
	
		System.out.println("Adding Lemon");
	}
	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Steeping the tea");
	}
 
}
