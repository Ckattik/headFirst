package headFirstPatternDeputy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	@Override
	public String sayHello() throws RemoteException {               // ���������� ��������� �� ���, ����� �� ����������� ��� ������ 
		// TODO Auto-generated method stub                          // ����������.� ����� ������ ����� ������ ����.
		return "Server says, HEY";
	}
	
	
	public MyRemoteImpl()  throws RemoteException { }              // ��������� ��� � ������������ �� �����,��� ����� ���� ������ �������� 
		                                                           // ��� ����������� ����� ������ ���������� ���������� 

	
	public static void main(String [] args) {
	
	try{
		
		MyRemote service = new MyRemoteImpl();
		Naming.rebind("Remote hello", service);                 // ��������� ����� ������ ��� (����� ������� ����� ������ �� � �������), � 
		                                                        // ��������������� �� � ������� RMI. ������� RMI �������� � ������ 
		                                                        // ���������� � ��������
	}catch(Exception ex) {
		ex.printStackTrace();
		System.out.print("Exception ... ");
	}
	
	
	
}
}