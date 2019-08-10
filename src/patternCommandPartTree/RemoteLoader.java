package patternCommandPartTree;

public class RemoteLoader {

	public static void main (String [] args) {
		
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan); // ������� ���������� ���� ������: ��� �������,
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);       // ��� ������� ��������, � ��� ����������
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		
	    remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand); //������� ��������� ������� � ������� �������� ����������� � 
	    remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);   // ������ 0 � 1
		
	    remoteControl.onButtonWasPushed(0); // ������� �������� ������� �������� 
	    remoteControl.offButtonWasPushed(0);// ����� ��������� ����������
	    
	    System.out.println(remoteControl);
	    
	    remoteControl.undoButtonWasPushed(); // ������ ����� ������ ���������� ������� �������� 
	    
	    remoteControl.onButtonWasPushed(1); // �� ���� ��� �������� ������� �������� 
	    System.out.println(remoteControl);
	    remoteControl.undoButtonWasPushed();//� ����� ������ ������ ��������� ������� �������� 
	      
	    
	    System.out.println();
	    System.out.println();

	    
	    Light light = new Light("Living Room");    //�������� �������� ���������
	    TV tv = new TV("Living Room");
	    Stereo stereo = new Stereo("Living Room");
	    Hothub hothub = new Hothub();
	    
	    
	    LightOnCommand lightOn = new LightOnCommand(light);
	    LightOffCommand lightOff = new LightOffCommand(light);
	    
	    StereoOnCommand stereoOn = new StereoOnCommand(stereo); 
	    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
	    
	    TVOnCommand tvOn = new TVOnCommand(tv);
	    TVOffCommand tvOff = new TVOffCommand(tv);
	    
	    HothubOnCommand hottubOn = new HothubOnCommand(hothub);
	    HothubOffCommand hottubOff = new HothubOffCommand(hothub);
	    
	    
	    Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn };             //������� ������ ��� � ����.
	    Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};		
	    
	    MacroCommand partyOnMacro = new MacroCommand(partyOn);             // � ��� ������� ����������� � ������� ��� ���������
	    MacroCommand partyOffMacro = new MacroCommand(partyOff);
	    
	    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
	  //  remoteControl.setCommand(1, partyOffMacro, partyOnMacro);
	    remoteControl.onButtonWasPushed(0);                               // ����� ������� ����������� 
	    remoteControl.offButtonWasPushed(0);                               // ����� ������� ������������
	    
	 /*   remoteControl.setCommand(0, lightOn, lightOff);              
	    remoteControl.setCommand(1, stereoOn, stereoOff);
	    remoteControl.setCommand(2, tvOn, tvOff);	
	    remoteControl.setCommand(3, hottubOn, hottubOff);
	    
	    
	    remoteControl.onButtonWasPushed(0);
	    remoteControl.offButtonWasPushed(0);
	    
	    remoteControl.onButtonWasPushed(1);
	    remoteControl.offButtonWasPushed(1);
	
	    remoteControl.onButtonWasPushed(2);
	    remoteControl.offButtonWasPushed(2);
	
	    remoteControl.onButtonWasPushed(3);
	    remoteControl.offButtonWasPushed(3);*/
	
	
	
	}


	
	
}
