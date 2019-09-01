package headFirstPatternDeputyDinamicPartTwo;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

	
	// Переменные экземпляров
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
		}
	
	
	public MatchMakingTestDrive() {                  // Конструктор инициализирует базу данных кандидатов службы знакомств
		// TODO Auto-generated constructor stub
	   initializeDataBase();
	}
	
	public void drive() {                                             
		
		PersonBean joe = getPersonFromDatabase("Joe Javabean");   // Чтение записи из БД
		PersonBean ownerProxy = getOwnerProxy(joe);               // Создание заместителя для владельца
		System.out.println("Name is " + ownerProxy.getName());    // Вызываем get-метод , затем set - метод
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Interests set from owner proxy");     
		
		try {
			
			ownerProxy.setHotOrNotRating(10);                        // затем пытаемся изменить оценку
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Raiting is " + ownerProxy.getHotOrNotRating());
		
		
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);                 // Заместителя для другого пользователя 
		System.out.println("Name is " + nonOwnerProxy.getName());         // Вызываем get -- метод , затем set -метод 
		
		try {
			
			nonOwnerProxy.setInterests("bowling, Go");                            
			
			}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		nonOwnerProxy.setHotOrNotRating(3);                                 // теперь пытаемся задать оценку
		System.out.println("Raiting set from non owner proxy");
		System.out.println("Raiting is " + nonOwnerProxy.getHotOrNotRating() );
	}
	
	
	  public PersonBean getOwnerProxy(PersonBean person) {        // Метод получает реальный обьект (данные конкретного человека) и возвращает для него 
                                                                  // заместителя.Так как заместитель обладает тем же интерфейсом что и реальный обьект
        return (PersonBean)Proxy.newProxyInstance(                // Для создания заместителя используеться стат.метод newProxyInstance класа Proxy
        person.getClass().getClassLoader(),                       // Передаем ему загрузчик класа для нашего реального обьекта 
        person.getClass().getInterfaces(),                        // и набор интерфейсов который должен реализовать заместитель
        new OwnerInvocationHandler(person));                      // Коструктору обработчика передаеться реальный обьект 
}

	
	  public PersonBean getNonOwnerProxy(PersonBean person) {      
          return (PersonBean)Proxy.newProxyInstance(                
                  person.getClass().getClassLoader(),                       
                  person.getClass().getInterfaces(),                        
                  new NonOwnerInvocationHandler(person));                       
}
	

}
