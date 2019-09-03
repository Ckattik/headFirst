package observerPatternNativeSupport;

import java.util.Observable;
import java.util.Observer;


public class ForecastDisplay implements Observer, DisplayElement {

	
	private float currentPressure = 29.92f;
	private float lastPressure;
	
	
	
	@Override
    public void display() {
	// TODO Auto-generated method stub
	
}
	
	
	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}
	
	
	
	
	
	
	
	@Override
	public void update(Observable observable, Object arg) {
		// TODO Auto-generated method stub
		
		if(observable instanceof WeatherData) {
		
			WeatherData weatherData = (WeatherData)observable;
			lastPressure = currentPressure;
		    currentPressure = weatherData.getPressure(); 
		}
		
	}
	
}	
