package headFirstPatternDeputyDinamicPartTwo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OwnerInvocationHandler implements InvocationHandler {  // ��� ����������� ��������� ��������� InvocationHandler
	

	PersonBean person;
	
	public OwnerInvocationHandler(PersonBean person) {             // �������� �������� ������ � ������������ � ��������� ������ �� ���� 
		// TODO Auto-generated constructor stub
		this.person = person;
	}
	
	
	@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {    // ��� ������ ������ ������ �����������
			// TODO Auto-generated method stub                                                 // ����������� ����� invoke()
		
		
		try {
			if(method.getName().startsWith("get")) {                  // ���� ������ get - ����� ���� ����������� ��������� �������  
				return  method.invoke(person, args); 
			}else if(method.getName().equals("setHotOrNotRating")) {  // ����� ������ setHotOrNotRiting() ,������������ ������� ����������
				 throw new IllegalAccessException();
			}else if(method.getName().startsWith("set")) {            // ����� ����� ������ ������� ��������� �������� �������� ��������� ������� 
				return method.invoke(person, args);
			}
			}catch(Exception ex) {                                    // ������������ ��� ������ ���������� ������� �������� 
			ex.printStackTrace();
		}
		
		
		return null;                                                  // ��� ������ ������ ������ ������� �� ������ ���������� null ����� 
		                                                              // �������� ������� ����� 
		}
	
	
	
	
	
	
}
