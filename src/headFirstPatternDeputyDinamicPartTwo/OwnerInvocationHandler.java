package headFirstPatternDeputyDinamicPartTwo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OwnerInvocationHandler implements InvocationHandler {  // Все обработчики реализуют интерфейс InvocationHandler
	

	PersonBean person;
	
	public OwnerInvocationHandler(PersonBean person) {             // Передаем реальный обьект в конструкторе и сохраняем ссылку на него 
		// TODO Auto-generated constructor stub
		this.person = person;
	}
	
	
	@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {    // При каждом вызове метода заместителя
			// TODO Auto-generated method stub                                                 // вызываеться метод invoke()
		
		
		try {
			if(method.getName().startsWith("get")) {                  // Если вызван get - метод візов передаеться реальному обьекту  
				return  method.invoke(person, args); 
			}else if(method.getName().equals("setHotOrNotRating")) {  // Вызов метода setHotOrNotRiting() ,блокируеться выдачей исключения
				 throw new IllegalAccessException();
			}else if(method.getName().startsWith("set")) {            // вызов любых других методов владельцу разрешен передаем реальному обьекту 
				return method.invoke(person, args);
			}
			}catch(Exception ex) {                                    // Выполняеться при выдаче исключений рельным обьектом 
			ex.printStackTrace();
		}
		
		
		return null;                                                  // при выдаче любого друого обьекта мы просто возвращаем null чтобы 
		                                                              // избежать лишнего риска 
		}
	
	
	
	
	
	
}
