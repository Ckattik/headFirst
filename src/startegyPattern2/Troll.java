package startegyPattern2;

public class Troll extends Character {

      public Troll() {
    	  weaponBehavior = new AxeBehavior();
      }
	
	
	@Override
	public void fight() {
		// TODO Auto-generated method stub
	
		System.out.println("I am Troll");
		
	}
}
