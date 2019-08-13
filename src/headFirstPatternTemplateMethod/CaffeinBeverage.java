package headFirstPatternTemplateMethod;

public abstract class CaffeinBeverage {

	final void prepareRecipe() {   //��������� ����� .final ��� ���� ��� �� ��������� �� ����� �������� ������� ��������(��������������)
    boilWater();
	brew();
	pourInCup();
	
	if(custumerWantCondiments()) {
	addCondiments();
	}
	
	}
	
	abstract void brew();              //��������� ������ ������������ �� ����������
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
