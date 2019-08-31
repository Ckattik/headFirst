package headFirstPatternDeputyRemotePartTwo;

import java.rmi.*;                // ���������� ������������ ����� rmi ��������� ���� ������������� ����� RemoteException 

public class GumballMonitor {
      GumballMachineRemote machine;
      
	
      public GumballMonitor(GumballMachineRemote machine) {       // � ���������� �� ����� �������� � ����������� ���������� ���������� ������� 
		// TODO Auto-generated constructor stub                   //  � �� � ����������� ������ GumballMachine
    	  this.machine = machine;
	}
	
      
      public void report() {
    	  try {
    		  
    		  System.out.println("Gumball Machine:  " + machine.getLocation() );
    			System.out.println("Current inventory " + machine.getCount() + "gumballs .");
    			System.out.println("Current state " + machine.getState());
    		  
    	  }catch(RemoteException ex) {                  // ����� ���������� ����������� ��� ��������� ��������� ��� ������ ������� ������� �
    		  ex.printStackTrace();                     // ���������� ������������ �� ����
    	  }
      }
      
      
}
