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
	    
	    
	}


	
	
}
