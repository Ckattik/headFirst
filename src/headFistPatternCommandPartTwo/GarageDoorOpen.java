package headFistPatternCommandPartTwo;

public class GarageDoorOpen implements Command {

	Door door;
	
	public GarageDoorOpen(Door door) {
		this.door = door;
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
	
		door.doorOpen();
		
	}
	
	@Override
	public void undo() {
		// TODO Auto-generated method stub
	    door.doorClosed();	
	}
	
	
}
