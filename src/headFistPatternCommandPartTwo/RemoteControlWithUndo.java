package headFistPatternCommandPartTwo;



// ���������� ������ �� 7 ������ 
public class RemoteControlWithUndo {
	
	Command [] onCommands;   // � ���� ������ ����� ����� ������������ ��� 7 ������ ���/���� ������� �����
	Command [] offCommands;   // ��������� � ��������������� �������
	Command undoCommand;      //���������� ��� �������� ��������� ���������� �������
	
	public RemoteControlWithUndo() {
		onCommands = new Command[7];   // ����������� ������� ���������� ������ � �������������� ������� onCommands � offCommands
		offCommands = new Command[7];
		
		Command noCommand = new  noCommand();
		
		for(int i = 0; i < 7; i++) {
			
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		undoCommand = noCommand;
		
	}

	public void setCommand(int slot, Command onCommand,Command offCommand) {   // ����� setComand �������� ������ � ������� ���/����
		                                                                       // ��� ���� ������. ������� ������������ � �������� ��� ������������ ������������� 
		
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
		
	}
	
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		  undoCommand = onCommands[slot];            //��� ������� ������ �� ������� ������ ������� � ��������� ��, � �� ��� ���. ������ �� ��� � ���������� undoCommand 
	}                                                  // ��� ������� ��� ��� ���� ����� �������� ��������������� �����
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
   public void undoButtonWasPushed() {          // ��� ������� ������ ������ �� �������� ����� undo() �������, ��������� � ���������� undoCommand
	   undoCommand.undo();                      // ����� �������� �������� ��������� ���������� �������
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
