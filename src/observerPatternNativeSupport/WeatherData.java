package observerPatternNativeSupport;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{                 // 1.����������� ���������� Observer/Observable	
	private float temperature;                               // 2.������������ Observable
	private float humidity;                                  // 3.��������������� �� ���� ��� ���������� �������������
	private float pressure;

	public WeatherData() {
		
	}
	
	public void measurementsChanged() {              
	  setChanged();
	  notifyObservers();                                      // 4.������ ������ �� ����������� ��� ������ ��� �� ���������� ������ 
	                                                          // ������� ������
	}
	                                                          // 5.����� ������� notifyObservers(); ���������� ������� setChanged();   
	                                                              
	public void setMeasurements(float temperature, float humidity, float pressure) {
   	 this.temperature = temperature;                                               
   	 this.humidity = humidity;                                                      
   	 this.pressure = pressure;                                                      
    }                                                                               
	
    
      public float getTemperature() {
		return temperature;
	}
                                                               // 6. ��� ������� ����� �������������� ������������� ��� ��������� ��������� ������� 
      public float getHumidity() {                             // WheatherData
	        return humidity;
     }
 
        
     public float getPressure() {
		return pressure;
	}




}
