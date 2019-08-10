package patternCommandPartTree;

public class Stereo {
	
	String name;
	 
	public Stereo(String name) {
		this.name = name;
		
	}
	
	

	public void onStereo() {
		System.out.println("on Stereo");
	}
	
	public void offStereo() {
		System.out.println("off Stereo");
	}
	
	
	
	public void setCD() {
		System.out.println("set CD");
	}
	
	public void setVolume() {
		System.out.println("Volume 11");
	}
	


}
