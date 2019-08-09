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
}
