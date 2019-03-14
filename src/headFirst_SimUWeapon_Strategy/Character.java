package headFirst_SimUWeapon_Strategy;

public abstract class Character {
	
	
	WeaponBehavior weapon;
	
	
	public Character() {
		
	}
	
	
     public abstract void fight();	
     
     
     
     
     public void perfomWeapon() {
    	 weapon.useWeapon();
     }
	

     public void setWeapon(WeaponBehavior w) {
    	 
    	 this.weapon = w;
     }
     
     
}
