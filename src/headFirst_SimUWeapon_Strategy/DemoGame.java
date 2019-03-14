package headFirst_SimUWeapon_Strategy;

public class DemoGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Character queen = new Queen();
		
		queen.perfomWeapon();
		
		Character king = new King();
		
		king.perfomWeapon();
		
		Character knight = new Knight();
	
		knight.perfomWeapon();
		
		Character troll = new Troll();
		troll.perfomWeapon();
		troll.setWeapon(new KnifeBehavior());
		troll.perfomWeapon();
		
		
	}

}
