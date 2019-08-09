package headFistPatternCommandPartTwo;

public class CellingFanOffCommand implements Command {
	
Fan fan;

	
	public CellingFanOffCommand(Fan fan) {
		this.fan = fan;
		
		
	}
 
	@Override
		public void execute() {
			// TODO Auto-generated method stub
		    fan.offFan();
		
		}
	
	@Override
		public void undo() {
			// TODO Auto-generated method stub
		fan.onFan();	
		}

}
