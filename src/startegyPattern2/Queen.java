package startegyPattern2;

public class Queen extends Character {

	public Queen() {
		weaponBehavior = new KnifeBehavior();
	}
	
	
	@Override
	public void fight() {
		// TODO Auto-generated method stub
	
		System.out.println("I am Queen");
		
	}
}
