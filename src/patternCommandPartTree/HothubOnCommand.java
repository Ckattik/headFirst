package patternCommandPartTree;



public class HothubOnCommand implements Command {
	
	Hothub hothub;
	
	
	public HothubOnCommand(Hothub hothub) {
		this.hothub = hothub;
	}
	
    @Override
    	public void execute() {
    		// TODO Auto-generated method stub
    	hothub.onHothub();
    	
    	}
    
    @Override
    	public void undo() {
    		// TODO Auto-generated method stub
    	
    	}


	
	
	
	
}
