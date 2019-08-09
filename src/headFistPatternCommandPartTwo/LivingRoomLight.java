package headFistPatternCommandPartTwo;

public class LivingRoomLight implements Command {

	
	Light light;
	
	public LivingRoomLight(Light light) {
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
