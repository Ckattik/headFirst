package headFirstPatternCommand;

public class GarageDoorOpenCommand implements Command{

	
	Door door;
	
	public GarageDoorOpenCommand(Door door) {
		this.door = door;
	}

	
	
	
	
	
	
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.openDoor();
	
		
		
	}
	
}
