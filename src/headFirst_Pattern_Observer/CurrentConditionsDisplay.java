package headFirst_Pattern_Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // ������� ��������� Observer ��� �� �������� ������ �� ������ WetherData
	//����� ��������� ��������� DisplayElement ��� � ��� ���������� �������� � ����� API 
	
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	
	public CurrentConditionsDisplay(Subject weatherData) {   // ������������ ����������� ������ WeatherData, ������� ������������� ��� �����������
		this.weatherData = weatherData;                      // �������� � �������� �����������
		weatherData.registerObserver(this);
		
	}
	
	
	
	
	
	
	@Override
	public void display() {                               //������� ������� ��������� ����������� � ���������
		// TODO Auto-generated method stub

	   System.out.println("CurrentConditions: " + temperature + " F degrees and" + humidity + "% humidity");
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub

		this.temperature = temp;                     // ��� ������ ������ update() �� ��������� �������� ����������� � ���������
		this.humidity = humidity;                    //����� ���� �������� ����� display()
		display();
		
		
	}

}
