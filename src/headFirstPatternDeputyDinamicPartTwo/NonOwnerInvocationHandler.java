package headFirstPatternDeputyDinamicPartTwo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler{

	PersonBean person;
	
	
	public NonOwnerInvocationHandler(PersonBean person) {
		// TODO Auto-generated constructor stub
		
		this.person = person;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		try {
			if(method.getName().startsWith("get")) {                  // Если вызван get - метод візов передаеться реальному обьекту  
				return  method.invoke(person, args); 
			}else if(method.getName().equals("setHotOrNotRating")) {  
				 return method.invoke(person, args); 
			}else if(method.getName().startsWith("set")) {            
				throw new IllegalAccessException();
			}
			}catch(Exception ex) {                                    // Выполняеться при выдаче исключений рельным обьектом 
			ex.printStackTrace();
		}
		
		
		return null;                                                  // при выдаче любого друого обьекта мы просто возвращаем null чтобы 
		                                                              // избежать лишнего риска 
		
	
		
		
		
	
	}
	
	
	
	
	
	
}
