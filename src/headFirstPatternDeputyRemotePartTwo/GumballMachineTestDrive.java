package headFirstPatternDeputyRemotePartTwo;

import java.rmi.Naming;

public class GumballMachineTestDrive {

	public static void main(String [] args) {
		GumballMachineRemote gumballMachine = null;
	
	  int count = 0;
	   
	  if(args.length > 2) {
		  System.out.println("GumballMachine <name><inventory>");
		  System.exit(1);
	  }
	
	  try {                                                                // Создание экземпляра заключенного в скобки  try/catch
		  Integer.parseInt(args[1]);                                       // потомучто конструктор может инициировать исключение
		  
		  gumballMachine = new GumballMachine(args[0], count);
		  Naming.rebind("//" + args[0] + "/gumballMachine", gumballMachine); // Также добавляем вызов Nzming.rebind() который публикует заглушку 
		                                                                     // GumballMachine под именем gumballMachine
		  
		  
	  }catch(Exception ex) {
		  ex.printStackTrace();
	  }
	  
	  
	
	
	}
	
	
}
