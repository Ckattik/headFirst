package headFistPatternCommandPartTwo;

public class GarageDoorClosedCommand implements Command{

    Door door;
	
	public GarageDoorClosedCommand(Door door) {
		this.door = door;
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
	        door.doorClosed();	
	}
	
}
