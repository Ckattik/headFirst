package patternDecorator;

public class StarbuzzCoffe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Beverage beverage = new Espresso();
		
		System.out.println(beverage.getDescription() +    //Заказываем Espresso без дополнений  
				" " + "$" + " " + beverage.cost());          
		
		Beverage beverage2 = new DarkRoast();              //  Создаем обьект DarkRoast.
		beverage2 = new Mocha(beverage2);                  //  Заворачиваем в обьект Mocha
		beverage2 = new Mocha(beverage2);                  //  Потом во второй 
		beverage2 = new Whip(beverage2);                   //  И еще в третий обьект Whip 
		
		System.out.println(beverage2.getDescription() +" "+ "$" +" " + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
	
		System.out.println(beverage3.getDescription() +" "+ "$" +" " + beverage3.cost() + " " + beverage3.getSize() );
	
	}

}
