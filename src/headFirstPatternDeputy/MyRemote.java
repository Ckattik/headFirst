package headFirstPatternDeputy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote{  // Означает что интерфейс будет использоваться для поддержки удаленных вызовов
	
	public String sayHello() throws RemoteException;  // вызовы удаленных методов считаються "рисковаными". Обьявление RemoteExeption
	                                                  // в каждом методе обращает внимание клиента на то, что вызов может не сработать. 

	
	
	
	
	
}
