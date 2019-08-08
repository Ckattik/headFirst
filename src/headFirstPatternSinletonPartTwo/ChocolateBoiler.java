package headFirstPatternSinletonPartTwo;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	
	
	public ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		// Заполнение нагревателя молочно шоколадной смесью
		}
	}
	
	
	public void drain() {
		if(!isEmpty) && isBoiled(){
			//Слить нагретое молоко и шоколад
	       
			empty = true;
		
		}
		
	}
	
	public void boil() {
		if(!isEmpty && isBoiled) {
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
