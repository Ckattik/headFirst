package startegyPattern2;

public class SimPalace {

	public static void main (String [] args) {
		
		Character troll = new Troll();
		troll.fight();
		troll.weaponBehavior();
		
		Character king = new King();
		king.fight();
		king.weaponBehavior();
		
		
		Character queen = new Queen();
		queen.fight();
		queen.weaponBehavior();
		
		
		Character knight = new Knight();
		knight.fight();
		knight.weaponBehavior();
	}
	
	
}
