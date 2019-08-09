package headFistPatternCommandPartTwo;

public class StreoOffWithCDCommand implements Command {

	Stereo stereo;
	
	
	  public StreoOffWithCDCommand(Stereo stereo) {
		  this.stereo = stereo;
	  }
	
	  
	  @Override
	public void execute() {
		// TODO Auto-generated method stub
	      stereo.offStereo();	
	}
	
	
	
	
}
