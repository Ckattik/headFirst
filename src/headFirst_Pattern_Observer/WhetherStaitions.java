package headFirst_Pattern_Observer;

public class WhetherStaitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherData weatherData = new WeatherData();
		
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		
	//	StatisticsDisplay statisticDisplay = new StatisticDisplay(weatherData); 
	//	ForecastDisplay forecastDisplay = new ForestDisplay(weatherData);         // Создаем три вузуальных елемента передавая им WheatherData 
		
		weatherData.setMesurements(30, 65, 30.4f);   //имитация новых погодных данных
		weatherData.setMesurements(82, 70, 32.2f);   // 
		weatherData.setMesurements(78, 90, 29.2f);   //
		
	}

}
