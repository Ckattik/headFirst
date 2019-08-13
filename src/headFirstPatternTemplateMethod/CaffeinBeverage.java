package headFirstPatternTemplateMethod;

public abstract class CaffeinBeverage {

	final void prepareRecipe() {   //Шаблонный метод .final для того что бы субклассы не могли изменить порядок действий(переопределить)
    boilWater();
	brew();
	pourInCup();
	
	if(custumerWantCondiments()) {
	addCondiments();
	}
	
	}
	
	abstract void brew();              //Суббкласы должны предоставить их реализацию
	abstract void addCondiments();
	
	public void boilWater() {
		System.out.println("Boiling water");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	public boolean custumerWantCondiments() {
		return true;
	}
	
	
	
}
