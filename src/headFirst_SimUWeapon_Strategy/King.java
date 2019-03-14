package headFirst_SimUWeapon_Strategy;

public class King extends Character {

	public King() {
		weapon = new BowAndArrowBehavior();
	}
	
	
	
	@Override
	public void fight() {
		// TODO Auto-generated method stub
         System.out.println("King = BowAndArrow");
	}

}
