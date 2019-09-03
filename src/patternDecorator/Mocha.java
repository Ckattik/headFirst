package patternDecorator;

public class Mocha extends CondimentDecorator{                // CondimentDecorator разширяет Beverage
	Beverage beverage;                                        //Что бы в обьекте Mocha Хранилась ссылка на Beverage нам понадобиться :
	                                                              // 1.Переменная для хранения ссылки
                                                                  // 2.Способ присваивания переменной ссылки на обьект. Мы будем передавать ссылку 
	                                                              // при вызове конструктора 
	
	public Mocha(Beverage beverage) {
		
		this.beverage = beverage;
		
	}
                                                               //В описании должны содержаться не тоько название напитка но и все дополнения например	
  	@Override                                                  // "Dark Roas Mocha".Таким образом мы сначала получаем описание, делегируя вызов 
 		public String getDescription() {                       // Декорируему обьекту а затем присоединяем ему стороку ", Mocha"
			// TODO Auto-generated method stub
			return beverage.getDescription() + ", Mocha";
		}
	
	@Override
		public double cost() {
			// TODO Auto-generated method stub
			return 20 + beverage.cost();
		}

}
