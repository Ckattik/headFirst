package headFirstPatternDeputyRemotePartTwo;

import java.rmi.*;                // Необходимо ипортировать пакет rmi потомучто ниже используеться класс RemoteException 

public class GumballMonitor {
      GumballMachineRemote machine;
      
	
      public GumballMonitor(GumballMachineRemote machine) {       // В дальнейшем мы будем работать с реализацией интерфейса удаленного доступа 
		// TODO Auto-generated constructor stub                   //  а не с конктретным класом GumballMachine
    	  this.machine = machine;
	}
	
      
      public void report() {
    	  try {
    		  
    		  System.out.println("Gumball Machine:  " + machine.getLocation() );
    			System.out.println("Current inventory " + machine.getCount() + "gumballs .");
    			System.out.println("Current state " + machine.getState());
    		  
    	  }catch(RemoteException ex) {                  // Также необходимо перехватить все иключения возможные при вызове методов которые ф
    		  ex.printStackTrace();                     // фактически исполняються по сети
    	  }
      }
      
      
}
