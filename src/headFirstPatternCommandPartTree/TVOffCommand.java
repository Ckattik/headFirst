package headFirstPatternCommandPartTree;

public class TVOffCommand implements Command{

TV tv;
	
	
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}
	
    @Override
    	public void execute() {
    		// TODO Auto-generated method stub
    	tv.offTV();
    	
    	}
    
    @Override
    	public void undo() {
    		// TODO Auto-generated method stub
    	
    	}


	
	
}
