package headFirstPatternCommand;

public class GarageDoorOpen implements Command{

	
	Door door;
	
	public GarageDoorOpen(Door door) {
		this.door = door;
	}

	
	
	
	
	
	
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.openDoor();
	
		
		
	}
	
}
