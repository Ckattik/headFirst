package headFirstPatternDeputy;


import java.rmi.Naming;


 public class MyRemoteClient    {
      public static void main(String [] args) {
    	  new MyRemoteClient().go();
      }
      
  public void go() {
	  try{
    		  
   MyRemote service = (MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");  // Возвращаеться из реестра в виде типа Object не забудьте выполнить преобразование 
    		                                                                   // IP =  адрес и имя хоста 
    		String s = service.sayHello();                                     // RemoteHello - имя использованое для идентификации службы
    		  System.out.println(s);
    		  
    		  
    	  }catch(Exception ex) {
    		  ex.printStackTrace();
    	  }
      }
      
      
}
