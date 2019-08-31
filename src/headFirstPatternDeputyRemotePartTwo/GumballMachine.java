package headFirstPatternDeputyRemotePartTwo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



/* ����� GumballMachine ����� �������������� UnicastRemoteObject:  
 * ��� ��������� ��� �������� � ������ ��������� ������.
 * GumballMachine ������ ����� ����������� ��������� 
 * ���������� �������
 */ 

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
                                                                                        	
	
	
	State state;                                    // ���������� ���������� ��� �������� State 
	int count = 0;                                  // � ���������� count ��������� ���������� ������� - ���������� ������� ���� 
    String location;	
	
	
	public GumballMachine(String location, int numberGumballs) throws RemoteException{     // ����������� �������� �������� ���������� ������� � ��������� ��� � ����������
	
		this.location = location;
    	this.count = numberGumballs;
		
		
	}
	
	@Override
	public State getState() throws RemoteException {
		// TODO Auto-generated method stub
		return state;
	}
	
	@Override
	public int getCount() throws RemoteException {
	// TODO Auto-generated method stub
	return count;
	}
	
	@Override
	public String getLocation() throws RemoteException {
	// TODO Auto-generated method stub
	return location;
	}
	



}
