package patternDecorator;

public class Espresso extends Beverage{    //¬се класы конкретных напитков разшир€ют Beverage 

	
	public Espresso() {                   // ќписание задаетьс€ в конструкторе класса —тоит напомнить что переменна€ description наследуетьс€ от Beverage
		description = "Espresso";
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	@Override                                   //ќстаетьс€ вычислить стоимость напитка. ¬ этом классе беспокоитьс€ о дополнени€х не нужно 
        	public double cost() {              //поетому мы просто возвращаем стоимость базового Espresso $1.99
		// TODO Auto-generated method stub
		return 1.99;
	}
	
}
