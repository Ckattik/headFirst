package headFistPatternCommandPartTwo;



// Реализация пульта на 7 кнопок 
public class RemoteControl {
	
	Command [] onCommands;   // В этой версии бульт будет поддерживать все 7 команд вкл/выкл которые будут
	Command [] offCommands;   // храниться в соответствующих масивах
	
	public RemoteControl() {
		onCommands = new Command[7];   // Конструктор создает экземпляры команд и инициализирует массивы onCommands и offCommands
		offCommands = new Command[7];
		
		Command noCommand = new  noCommand();
		
		for(int i = 0; i < 7; i++) {
			
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand,Command offCommand) {   // Метод setComand получает ячейку и команды вкл/выкл
		                                                                       // для этой ячейки. Команды сохраняються в массивах для последующего использования 
		
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
		
	}
	
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}                                                  // при нажатии вкл или выкл пульт вызывает соответствующий метод
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n-----------RemoteControl-------/n");
		        for(int i = 0; i < onCommands.length; i++) {
		        	stringBuff.append( "[slot " + i + "] " + onCommands[i].getClass().getName()
		        	    + "    " + offCommands[i].getClass().getName() + "\n");
		        }
		        
		        return stringBuff.toString();
	}
	
	
}
