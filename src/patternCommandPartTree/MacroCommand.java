package patternCommandPartTree;

public class MacroCommand implements Command{
	
	Command [] commands; 
	
	public MacroCommand(Command [] commands) {   // Ѕерем масив команд и сохран€ем его в обьекте MacroCommand
		
		this.commands = commands;
		
	}
	
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();                  // ѕри выполнении макрокоманды все эти команды будут последовательно выполнены
		}
	}
	
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();                 
		}
		}

}
