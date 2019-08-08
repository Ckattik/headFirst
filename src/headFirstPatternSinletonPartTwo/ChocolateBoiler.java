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
		// Заполнение нагревателя молочно шоколадной смесью
		}
	}
	
	
	public void drain() {
		if(!isEmpty() && isBoiled()){
			//Слить нагретое молоко и шоколад
	       
			empty = true;
		
		}
		
	}
	
	public void boil() {
		if(!isEmpty() && isBoiled()) {
			boiled = true;
			
			// довести содержимое до кипения 
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
