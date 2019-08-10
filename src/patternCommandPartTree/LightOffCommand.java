package patternCommandPartTree;



public class LightOffCommand implements Command {

Light light;
	
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
    @Override
    	public void execute() {
    		// TODO Auto-generated method stub
    	light.offLight();
    	
    	}
    
    @Override
    	public void undo() {
    		// TODO Auto-generated method stub
    	
    	}

}
