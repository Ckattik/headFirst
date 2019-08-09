package headFistPatternCommandPartTwo;

import headFistPatternCommandPartTwo.RemoteControlWithUndo;

public class RemoteLoader {

	    static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		
		Light livingRoomLight = new Light("Living room");   //�������� ���� ���������
		Light kitchenLight = new Light("Kitchen");
		Fan cellingFan = new Fan("Living room");
		Door garageDoor = new Door("");
		Stereo stereo = new Stereo("Living room");
		
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);       // �������� ������ ��� ���������� ����������
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);
		
		CellingFanOnCommand cellingFanOn = 	new CellingFanOnCommand(cellingFan);	   // �������� ������ ��� ���������� ���������� ������������
		CellingFanOffCommand cellingFanOff = 	new CellingFanOffCommand(cellingFan);
		
		GarageDoorOpen garageDoorOpen = new GarageDoorOpen(garageDoor);                    //�������� ������ ��� ���������� ������ ������
		GarageDoorClosedCommand garageDoorclosed = new GarageDoorClosedCommand(garageDoor);
	
		StreoOnWithCDCommand streoOnWithCDCommand = new StreoOnWithCDCommand(stereo);     //�������� ������ ��� ���������� ������ ��������
		StreoOffWithCDCommand streoOffWithCDCommand = new StreoOffWithCDCommand(stereo);
	
		
		remoteControl.setCommand(0, livingRoomLightOn,livingRoomLightOff );          //������� ������� ������������ � �������� ������
		remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
		remoteControl.setCommand(2, cellingFanOn, cellingFanOff);
        remoteControl.setCommand(3, streoOnWithCDCommand, streoOffWithCDCommand);
        
        
        System.out.println(remoteControl);    // ����� toString() ������� ������ ����� � �������� � ��� ������
        
        remoteControl.onButtonWasPushed(0);   // ���������� ��� ������ � ��� ������ ������ ��������� ������� ������ ��� � ����
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        
        
        
		
		
	}

}
