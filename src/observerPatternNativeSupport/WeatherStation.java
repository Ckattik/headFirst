package observerPatternNativeSupport;



public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(45, 58, 78);
        weatherData.measurementsChanged();
        
        weatherData.setMeasurements(55, 98, 99);
        weatherData.measurementsChanged();
		
        weatherData.setMeasurements(60, 100, 102);
        weatherData.measurementsChanged();
	}

}
