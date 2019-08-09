package headFistPatternCommandPartTwo;

public class StreoOnWithCDCommand  implements Command{

	Stereo stereo;
	
	
	  public StreoOnWithCDCommand(Stereo stereo) {
		  this.stereo = stereo;
	  }
	
	
	
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.onStereo();
		stereo.setCD();
		stereo.setVolume();
	}
	
}
