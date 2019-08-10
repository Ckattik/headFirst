package headFirstPatternAdapter;

public class TurkeyAdapter implements Duck {    //Прежде всего необходимо реализовать интерфейс того типа, на который разчитан ваш клиент

	Turkey turkey;
	
	
	public TurkeyAdapter(Turkey turkey) {   // Затем следует получить ссылку на адаптируемый обьект; обычно это делаеться в констркторе
		this.turkey = turkey;
		
	}
	
	
	
	@Override
	public void fly() {                    // Хотя метод fly() входит в оба интерефейса, индюшка не умеет летать на дальние расстояния 
		// TODO Auto-generated method stub // что бы установить соответсвие между этими методами мы вызываем метод fly() у класса 
		for(int i = 0; i < 5; i ++) {      // Turkey пять раз
			turkey.fly();
		}
		
		
		
		
	}
	
	@Override
		public void quack() {                    // Адаптер должен реализовать все методы интерфейса Преобразование quack() 
		// TODO Auto-generated method stub	     // между классами выполняеться просто - реализация вызывает gobble()
 			
		turkey.gobble();	
		}
	
}
