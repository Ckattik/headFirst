package headFirst_SimUWeapon_Strategy;

public class Queen extends Character {

	public Queen() {
		weapon = new KnifeBehavior();
	}
	
	
	@Override
	public void fight() {
		// TODO Auto-generated method stub

		System.out.println("Queen fight the knife");	
		
		
	}

}
