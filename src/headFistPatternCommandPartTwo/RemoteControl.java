package headFistPatternCommandPartTwo;
// Реализация пульта на 7 кнопок 
public class RemoteControl {
	
	Command [] onCommands;   // В этой версии бульт будет поддерживать все 7 команд вкл/выкл которые будут
	Command [] offCommands;   // храниться в соответствующих масивах
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
	}

}
