package observerPattern;

public class WeatherStation {

	public static void main(String [] args) {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		
		weatherData.setMeasurements(40, 58, 30.4f);   //Имитация нових погодных данных
		weatherData.measurementsChanged();
		
		weatherData.setMeasurements(70, 60, 40.4f);
		weatherData.measurementsChanged();
		
		weatherData.setMeasurements(80, 75, 53.4f);
		weatherData.measurementsChanged();
		
		//currentDisplay.update(40, 52, 32);
		
		
		
	}
	
	
}
