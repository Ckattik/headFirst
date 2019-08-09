package headFistPatternCommandPartTwo;

public class CellingFanOnCommand implements Command{

	Fan fan;

	
	public CellingFanOnCommand(Fan fan) {
		this.fan = fan;
		
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.onFan();
	}
	
	@Override
	public void undo() {
		// TODO Auto-generated method stub
	    fan.offFan();	
	}
}
