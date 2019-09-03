package headFirstPatternManyPatterns;



public class QuackCounter implements Quackable{             // QuackCounter - декоратор 

	Observable observable;
	Quackable duck;                    // Переменная для хранения декорируемого обьекта
	static int numberOfQuacks;          // Для подсчета всех кваков используеться статическая переменная 
	
	public QuackCounter(Quackable duck) {
		// TODO Auto-generated constructor stub
		
		this.duck = duck;                        // В конструкторе получаем ссылку на декорируемую реализацию Quackable
		observable = new Observable(this);
	}
	
	@Override
		public void quack() {
			// TODO Auto-generated method stub
		   duck.quack();                        // Вызов quack() делегируеться декорируемой реализацией Quackable
		   numberOfQuacks++;                    // после чего увеличиваеться счетчик
		   notifyObservers();
		
		}
	
	public static int getQuacks() {           // Декоратор дополняеться статическим методом который возвращает количество кряков во 
		return numberOfQuacks;                // всех реализациях
	}
	
	@Override
		public void registerObserver(Observer observer) {
			// TODO Auto-generated method stub
		observable.registerObserver(observer);
		}
	
	@Override
		public void notifyObservers() {
			// TODO Auto-generated method stub
		observable.notifyObservers();
		}
	
	
	
}
