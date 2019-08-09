package headFistPatternCommandPartTwo;

public class KitchenLight implements Command {
	
	Light light;
	
	
	public KitchenLight(Light light) {
		this.light = light;
	}
	
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.onLight();
	}

}
