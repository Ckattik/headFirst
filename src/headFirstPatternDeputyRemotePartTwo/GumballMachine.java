package headFirstPatternDeputyRemotePartTwo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



/* Класс GumballMachine будет субкласировать UnicastRemoteObject:  
 * Это позволяет ему работать в режиме удаленной службы.
 * GumballMachine должен также реализовать интерфейс 
 * удалленого доступа
 */ 

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
                                                                                        	
	
	
	State state;                                    // Переменная экземпляра для хранения State 
	int count = 0;                                  // В переменной count храниться количество шариков - изначально автомат пуст 
    String location;	
	
	
	public GumballMachine(String location, int numberGumballs) throws RemoteException{     // Конструктор получает исходное количество шариков и сохраняет его в переменной
	
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
