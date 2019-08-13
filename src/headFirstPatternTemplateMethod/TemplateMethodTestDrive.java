package headFirstPatternTemplateMethod;

public class TemplateMethodTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tea myTea = new Tea();
		myTea.prepareRecipe();
		
		CoffeWithHook coffeWithHook = new CoffeWithHook();
		coffeWithHook.prepareRecipe();
		
		
		
	}

}
