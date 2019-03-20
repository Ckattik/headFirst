package headFirst_Pattern_Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // елемент реалезует Observer что бы получать данные от бьекта WetherData
	//также реалезует интерфейс DisplayElement как и все визуальные елементы в нашем API 
	
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	
	public CurrentConditionsDisplay(Subject weatherData) {   // Конструктору передаеться обьект WeatherData, который используеться для регистрации
		this.weatherData = weatherData;                      // елемента в качестве наблюдателя
		weatherData.registerObserver(this);
		
	}
	
	
	
	
	
	
	@Override
	public void display() {                               //выводит текущее сообщение температуры и влажности
		// TODO Auto-generated method stub

	   System.out.println("CurrentConditions: " + temperature + " F degrees and" + humidity + "% humidity");
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub

		this.temperature = temp;                     // при вызове метода update() мы сохраняем значения температуры и влажности
		this.humidity = humidity;                    //после чего вызываем метод display()
		display();
		
		
	}

}
