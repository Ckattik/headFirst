package headFirst_Pattern_Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
 
	
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WeatherData() {
		observers = new ArrayList(); // �������� ��������� ArrayList ��� �������� ������������
	}
	
	
	
     public void registerObserver(Observer o) {
	// TODO Auto-generated method stub
	observers.add(o);                                 // ����� ����������� ������ ������������ � ����� ������
    	 
}

@Override
		public void removeObserver(Observer o) {
			// TODO Auto-generated method stub
			
	        int i = observers.indexOf(o);
	        if(i >= 0) {
	        	observers.remove(i);              //���� ����������� ����� �������� ����������� �� ������ ������� �� ������ ArrayList
	        }
	
		}	
	
	
@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
	 for(int i = 0; i < observers.size(); i++) {                //���������� ������������ �� ��������� ��������� ����� ����� update, 
		                                                        //����������� ����� �������������
		 Observer observer = (Observer)observers.get(i);
		 observer.update(temperature, humidity, pressure);
	 }
	      
	 
} 
	 
	 public void meashurementsChanged() {                      //���������� ������������ � ��������� ����� ������
 		 notifyObserver();
	 }
	 

	 
	 public void setMesurements(float temperature, float humidity, float pressure) {
		 
		 this.temperature = temperature;                 // ��������� � ������� ���������� ����� ��� �� ��������� ������� ������ ������ ������
		 this.humidity = humidity;                       // c ���������� �� ������������� �������� ������� 
		 this.pressure = pressure;
		 
		 meashurementsChanged();
	 }
		
	


}
