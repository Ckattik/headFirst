package headFistPatternCommandPartTwo;

public class Fan {
	
	String name;
	
	
	public Fan(String name) {
		this.name = name;
	}

	public void onFan() {
		System.out.println("onFan");
	}
	
	public void offFan() {
		System.out.println("offFan");
	}
	
}
