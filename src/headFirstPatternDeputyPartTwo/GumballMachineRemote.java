package headFirstPatternDeputyPartTwo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {        // ��������� ���������� �������
 	  
	public int getCount() throws RemoteException;             // ��� ������������ ���� ������ ���� ������������ ��� Serializable
 	public String getLocation() throws RemoteException;       // ������ ������� ����� �������������� �������. ������ ����� ����� ������������ 
 	public State getState() throws RemoteException;           // RemoteException

	
	
	
}
