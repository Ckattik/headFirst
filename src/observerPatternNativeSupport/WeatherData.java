package observerPatternNativeSupport;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{                 // 1.Импортируем правильные Observer/Observable	
	private float temperature;                               // 2.Субкласируем Observable
	private float humidity;                                  // 3.Суперклассберет на себя все управления наблюдателями
	private float pressure;

	public WeatherData() {
		
	}
	
	public void measurementsChanged() {              
	  setChanged();
	  notifyObservers();                                      // 4.Обьект данных не передаеться это значит что мы используем модель 
	                                                          // ЗАПРОСА ДАННЫХ
	}
	                                                          // 5.Перед вызовом notifyObservers(); необходимо вызвать setChanged();   
	                                                              
	public void setMeasurements(float temperature, float humidity, float pressure) {
   	 this.temperature = temperature;                                               
   	 this.humidity = humidity;                                                      
   	 this.pressure = pressure;                                                      
    }                                                                               
	
    
      public float getTemperature() {
		return temperature;
	}
                                                               // 6. Эти геттеры будут использоваться наблюдателями для получения состояния обьекта 
      public float getHumidity() {                             // WheatherData
	        return humidity;
     }
 
        
     public float getPressure() {
		return pressure;
	}




}
