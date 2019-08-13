package headFirstPatternCommandPartTree;

public class HothubOffCommand implements Command {

Hothub hothub;
	
	
	public HothubOffCommand(Hothub hothub) {
		this.hothub = hothub;
	}
	
    @Override
    	public void execute() {
    		// TODO Auto-generated method stub
    	hothub.offHothub();
    	
    	}
    
    @Override
    	public void undo() {
    		// TODO Auto-generated method stub
    	
    	}


	
	
}
