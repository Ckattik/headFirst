package headFirstPatternDeputyPartTwo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {        // Интерфейс удаленного доступа
 	  
	public int getCount() throws RemoteException;             // Все возвращаемые типы должны быть примитивными или Serializable
 	public String getLocation() throws RemoteException;       // Методы которые будут поддерживаться службой. Каждый метод может инициировать 
 	public State getState() throws RemoteException;           // RemoteException

	
	
	
}
