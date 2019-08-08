package headFirstPatternCommand;

public class RemoteControlTest {    //  клиент

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleRemoteControl remote = new SimpleRemoteControl(); // обьект remote - ИНИЦИАТОР; ему будет передаваться обьект команды
		Light light = new Light();                              //Создание обьекта light который будет ПОЛУЧАТЕЛЕМ запроса 
		LightOnCommand lightOn = new LightOnCommand(light);
		
		
		
		Door door = new Door();
		GarageDoorOpenCommand openDoor = new GarageDoorOpenCommand(door);
		
		
		
		remote.setCommand(lightOn);             // команда передаеться ИНИЦИАТОРУ 
		remote.buttonWasPressed();              // Имитируем нажатие кнопки
		
		
		remote.setCommand(openDoor);
		remote.buttonWasPressed();
		
		
	}

}
