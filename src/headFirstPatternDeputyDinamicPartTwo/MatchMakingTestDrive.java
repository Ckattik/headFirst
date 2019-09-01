package headFirstPatternDeputyDinamicPartTwo;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

	
	// ���������� �����������
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
		}
	
	
	public MatchMakingTestDrive() {                  // ����������� �������������� ���� ������ ���������� ������ ���������
		// TODO Auto-generated constructor stub
	   initializeDataBase();
	}
	
	public void drive() {                                             
		
		PersonBean joe = getPersonFromDatabase("Joe Javabean");   // ������ ������ �� ��
		PersonBean ownerProxy = getOwnerProxy(joe);               // �������� ����������� ��� ���������
		System.out.println("Name is " + ownerProxy.getName());    // �������� get-����� , ����� set - �����
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Interests set from owner proxy");     
		
		try {
			
			ownerProxy.setHotOrNotRating(10);                        // ����� �������� �������� ������
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Raiting is " + ownerProxy.getHotOrNotRating());
		
		
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);                 // ����������� ��� ������� ������������ 
		System.out.println("Name is " + nonOwnerProxy.getName());         // �������� get -- ����� , ����� set -����� 
		
		try {
			
			nonOwnerProxy.setInterests("bowling, Go");                            
			
			}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		nonOwnerProxy.setHotOrNotRating(3);                                 // ������ �������� ������ ������
		System.out.println("Raiting set from non owner proxy");
		System.out.println("Raiting is " + nonOwnerProxy.getHotOrNotRating() );
	}
	
	
	  public PersonBean getOwnerProxy(PersonBean person) {        // ����� �������� �������� ������ (������ ����������� ��������) � ���������� ��� ���� 
                                                                  // �����������.��� ��� ����������� �������� ��� �� ����������� ��� � �������� ������
        return (PersonBean)Proxy.newProxyInstance(                // ��� �������� ����������� ������������� ����.����� newProxyInstance ����� Proxy
        person.getClass().getClassLoader(),                       // �������� ��� ��������� ����� ��� ������ ��������� ������� 
        person.getClass().getInterfaces(),                        // � ����� ����������� ������� ������ ����������� �����������
        new OwnerInvocationHandler(person));                      // ����������� ����������� ����������� �������� ������ 
}

	
	  public PersonBean getNonOwnerProxy(PersonBean person) {      
          return (PersonBean)Proxy.newProxyInstance(                
                  person.getClass().getClassLoader(),                       
                  person.getClass().getInterfaces(),                        
                  new NonOwnerInvocationHandler(person));                       
}
	

}
