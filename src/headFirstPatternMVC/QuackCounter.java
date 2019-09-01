package headFirstPatternMVC;

public class QuackCounter implements Quackable{             // QuackCounter - декоратор 

	Quackable duck;                    // Переменная для хранения декорируемого обьекта
	static int numberOfQuacks;          // Для подсчета всех кваков используеться статическая переменная 
	
	public QuackCounter(Quackable duck) {
		// TODO Auto-generated constructor stub
		
		this.duck = duck;                        // В конструкторе получаем ссылку на декорируемую реализацию Quackable
	}
	
	@Override
		public void quack() {
			// TODO Auto-generated method stub
		   duck.quack();                        // Вызов quack() делегируеться декорируемой реализацией Quackable
		   numberOfQuacks++;                    // после чего увеличиваеться счетчик
		
		
		}
	
	public static int getQuacks() {           // Декоратор дополняеться статическим методом который возвращает количество кряков во 
		return numberOfQuacks;                // всех реализациях
	}
	
	
}
