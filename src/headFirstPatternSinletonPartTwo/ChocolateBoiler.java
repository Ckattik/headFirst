package headFirstPatternSinletonPartTwo;

import headFirstPatternSinleton.Singleton;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	
	private static ChocolateBoiler uniqInstance;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	
	}
	
	
	// ????????????????????
	
	public static synchronized ChocolateBoiler getInstance() {
		if(uniqInstance == null) {
			uniqInstance = new ChocolateBoiler();
		}
		return uniqInstance;
	
	
	
}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		// ���������� ����������� ������� ���������� ������
		}
	}
	
	
	public void drain() {
		if(!isEmpty() && isBoiled()){
			//����� �������� ������ � �������
	       
			empty = true;
		
		}
		
	}
	
	public void boil() {
		if(!isEmpty() && isBoiled()) {
			boiled = true;
			
			// ������� ���������� �� ������� 
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
