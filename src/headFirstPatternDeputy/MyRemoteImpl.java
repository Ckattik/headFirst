package headFirstPatternDeputy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	@Override
	public String sayHello() throws RemoteException {               // Компилятор проследит за тем, чтобы вы реализовали все методы 
		// TODO Auto-generated method stub                          // интерфейса.В даном случае метод только один.
		return "Server says, HEY";
	}
	
	
	public MyRemoteImpl()  throws RemoteException { }              // Размещать код в конструкторе не нужно,Это всего лишь способ обьявить 
		                                                           // что конструктор супер класса инициирует исключение 

	
	public static void main(String [] args) {
	
	try{
		
		MyRemote service = new MyRemoteImpl();
		Naming.rebind("Remote hello", service);                 // Присвойте своей службе имя (чтобы клиенты могли искать ее в реестре), и 
		                                                        // зарегестрируйте ее в реестре RMI. Система RMI помещает в реестр 
		                                                        // информацию о заглушке
	}catch(Exception ex) {
		ex.printStackTrace();
		System.out.print("Exception ... ");
	}
	
	
	
}
}