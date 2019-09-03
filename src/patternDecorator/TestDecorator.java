package patternDecorator;

public class TestDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Soy soy = new Soy(new DarkRoast());
		String drink = soy.getDescription();
		double buy = soy.cost();
		
		System.out.println(drink);
		System.out.println(buy);
		
		
		
		
	}

}
