package startegyPattern2;

public abstract class Character {
	
	WeaponBehavior weaponBehavior;
	
	public Character() {
		
	}
	
	public abstract void fight();
	
	public void perfomTroll() {
		weaponBehavior.useWeapon();
	}
	
	
	public void set(WeaponBehavior wb) {
	this.weaponBehavior = wb;
	
	}

	public void weaponBehavior() {
		// TODO Auto-generated method stub
		weaponBehavior.useWeapon();
	}
	

}
