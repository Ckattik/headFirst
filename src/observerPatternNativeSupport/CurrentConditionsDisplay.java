package observerPatternNativeSupport;

import java.util.Observable;
import java.util.Observer;

                                                                          //1.����������� Observer/Observable
                                                                      
public class CurrentConditionsDisplay implements Observer , DisplayElement
{               // 2. ��������� ��������� Observer �� ������ java.util
                       
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {               // 3. ������ �������� �������� ��������� ������������ � �������� ����������� 
		this.observable = observable;
		observable.addObserver(this);
		
	}
	
	
	@Override
	public void update(Observable obs, Object arg) {                      // 4.����������� ����� update() �������� Observable � �������������� ������
		// TODO Auto-generated method stub
		if(obs instanceof WeatherData) {                                  // 5.� update() �� ������� ��������� ��� ������� ���������� � ���� WeatherData
			                                                              // ����� ���������� ��� ���-������ ��� ��������� ����������� � ��������� ����� ���� 
			WeatherData weatherData	= (WeatherData)obs;                   // �������� display()
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
