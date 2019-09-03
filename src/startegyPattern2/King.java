package startegyPattern2;

public class King extends Character {

	public King() {
		
		
		weaponBehavior = new SwordBehavior();
	}
	
	
	
	@Override
public void fight() {
	// TODO Auto-generated method stub
		System.out.println("I am King");
}
}
