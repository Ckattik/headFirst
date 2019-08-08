package headFirstPatternCommand;

public class RemoteControlTest {    //  ������

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleRemoteControl remote = new SimpleRemoteControl(); // ������ remote - ���������; ��� ����� ������������ ������ �������
		Light light = new Light();                              //�������� ������� light ������� ����� ����������� ������� 
		LightOnCommand lightOn = new LightOnCommand(light);
		
		
		
		Door door = new Door();
		GarageDoorOpenCommand openDoor = new GarageDoorOpenCommand(door);
		
		
		
		remote.setCommand(lightOn);             // ������� ����������� ���������� 
		remote.buttonWasPressed();              // ��������� ������� ������
		
		
		remote.setCommand(openDoor);
		remote.buttonWasPressed();
		
		
	}

}
