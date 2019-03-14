package headFirst_SimUWeapon_Strategy;

public class Knight extends Character {

	public Knight() {
		
		weapon = new AxeBehavior();
	}
	
	
	
	@Override
	public void fight() {
		// TODO Auto-generated method stub

		System.out.println("Knight = Axe !!!!!!!!!");
		
	}

}
