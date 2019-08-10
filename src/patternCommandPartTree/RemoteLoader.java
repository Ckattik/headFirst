package patternCommandPartTree;

public class RemoteLoader {

	public static void main (String [] args) {
		
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan); // Создаем экземпляры трех команд: для высокой,
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);       // для средней скорости, и для выключения
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		
	    remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand); //Команды включения средней и высокой скорости помещаються в 
	    remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);   // ячейки 0 и 1
		
	    remoteControl.onButtonWasPushed(0); // Сначала включаем среднюю скорость 
	    remoteControl.offButtonWasPushed(0);// Потом выключаем вентилятор
	    
	    System.out.println(remoteControl);
	    
	    remoteControl.undoButtonWasPushed(); // Отмена снова должна включиться средняя скорость 
	    
	    remoteControl.onButtonWasPushed(1); // На этот раз выбираем высокую скорость 
	    System.out.println(remoteControl);
	    remoteControl.undoButtonWasPushed();//И снова отмена должна вернуться средняя скорость 
	      
	    
	    System.out.println();
	    System.out.println();

	    
	    Light light = new Light("Living Room");    //Создание обьектов устройств
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
	    
	    
	    Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn };             //Массивы команд вкл и выкл.
	    Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};		
	    
	    MacroCommand partyOnMacro = new MacroCommand(partyOn);             // И два обьекта макрокоманд в которых они храняться
	    MacroCommand partyOffMacro = new MacroCommand(partyOff);
	    
	    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
	  //  remoteControl.setCommand(1, partyOffMacro, partyOnMacro);
	    remoteControl.onButtonWasPushed(0);                               // Одной кнопкой включаеться 
	    remoteControl.offButtonWasPushed(0);                               // Одной кнопкой выключаеться
	    
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
