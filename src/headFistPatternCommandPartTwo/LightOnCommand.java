package headFistPatternCommandPartTwo;

public class LightOnCommand implements Command {

Light light;
	
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
    @Override
    	public void execute() {
    		// TODO Auto-generated method stub
    	light.onLight();
    	
    	}
    
    @Override
    	public void undo() {
    		// TODO Auto-generated method stub
    	light.offLight();	
    	}
	
	
}
