package headFirstPatternSinletonPartTwo;

public class TestChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();
		
		
	}

}
