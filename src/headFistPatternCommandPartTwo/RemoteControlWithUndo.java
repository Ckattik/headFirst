package headFistPatternCommandPartTwo;



// Реализация пульта на 7 кнопок 
public class RemoteControlWithUndo {
	
	Command [] onCommands;   // В этой версии бульт будет поддерживать все 7 команд вкл/выкл которые будут
	Command [] offCommands;   // храниться в соответствующих масивах
	Command undoCommand;      //Переменная для хранения последней выполненой команды
	
	public RemoteControlWithUndo() {
		onCommands = new Command[7];   // Конструктор создает экземпляры команд и инициализирует массивы onCommands и offCommands
		offCommands = new Command[7];
		
		Command noCommand = new  noCommand();
		
		for(int i = 0; i < 7; i++) {
			
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		undoCommand = noCommand;
		
	}

	public void setCommand(int slot, Command onCommand,Command offCommand) {   // Метод setComand получает ячейку и команды вкл/выкл
		                                                                       // для этой ячейки. Команды сохраняються в массивах для последующего использования 
		
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
		
	}
	
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		  undoCommand = onCommands[slot];            //При нажатии кнопки мы сначала читаем команду и выполняем ее, а за тем сох. ссылку на нее в переменной undoCommand 
	}                                                  // при нажатии вкл или выкл пульт вызывает соответствующий метод
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
   public void undoButtonWasPushed() {          // При нажатии кнопки отмены мы вызыывем метод undo() команды, хранящйся п переменной undoCommand
	   undoCommand.undo();                      // Вызов отменяет операцию последней выполненой команды
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
