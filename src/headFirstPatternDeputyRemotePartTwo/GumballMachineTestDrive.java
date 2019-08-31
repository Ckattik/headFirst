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
	
	  try {                                                                // �������� ���������� ������������ � ������  try/catch
		  Integer.parseInt(args[1]);                                       // ��������� ����������� ����� ������������ ����������
		  
		  gumballMachine = new GumballMachine(args[0], count);
		  Naming.rebind("//" + args[0] + "/gumballMachine", gumballMachine); // ����� ��������� ����� Nzming.rebind() ������� ��������� �������� 
		                                                                     // GumballMachine ��� ������ gumballMachine
		  
		  
	  }catch(Exception ex) {
		  ex.printStackTrace();
	  }
	  
	  
	
	
	}
	
	
}
