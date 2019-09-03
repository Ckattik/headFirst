package observerPatternNativeSupport;

import java.util.Observable;
import java.util.Observer;

                                                                          //1.Импортируем Observer/Observable
                                                                      
public class CurrentConditionsDisplay implements Observer , DisplayElement
{               // 2. Реализуем интерфейс Observer из пакета java.util
                       
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {               // 3. Обьект елемента текущего состояния добавляеться в качестве наблюдателя 
		this.observable = observable;
		observable.addObserver(this);
		
	}
	
	
	@Override
	public void update(Observable obs, Object arg) {                      // 4.Обновленный метод update() получает Observable и необязательные данные
		// TODO Auto-generated method stub
		if(obs instanceof WeatherData) {                                  // 5.В update() мы сначала проверяем что субьект относиться к типу WeatherData
			                                                              // затем используем его гет-методы для получения температуры и влажности после чего 
			WeatherData weatherData	= (WeatherData)obs;                   // вызываем display()
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
			
		}
		
	}
	
	@Override
	public void display() {
     // TODO Auto-generated method stub
			
		System.out.println("Current conditions :" + temperature + "F degrees and" + humidity + "% humidity");	
		
		
		
					}
}
