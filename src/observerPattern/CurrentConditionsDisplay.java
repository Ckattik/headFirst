package observerPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {             //Конструктору передаеться обьект WeatherData, который используеться для 
		this.weatherData = weatherData;                                // регистрации елемента в качестве наблюдателя 
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {  // При вызове update() мы сохраняем значение температуры и влажности 
		// TODO Auto-generated method stub                                   // после чего вызываем display()
		this.temperature = temperature;
		this.humidity = humidity;
		display();
		
		
	}
	
	
	@Override
	public void display() {                                                                    // Медод display() просто выводит текущее значение 
		// TODO Auto-generated method stub                                                     // температуры и влажности 
		System.out.println("Current conditions :" + temperature + "F degrees and" + humidity + "% humidity");  
	}
	 

	
	
}
