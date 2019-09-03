package startegyPattern2;

public class Knight extends Character {

	public Knight() {
		weaponBehavior = new BowAndArrowBehavior();
	}
	
	
	@Override
	public void fight() {
		// TODO Auto-generated method stub
	
		System.out.println("I am Knight");
	}
}
