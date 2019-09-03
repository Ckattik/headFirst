package observerPattern;

import java.util.ArrayList;


public class WeatherData implements Subject{
	
	private ArrayList observers;
	float temperature;
	float humidity;
	float pressure;
	
	
	public WeatherData() {
		observers = new ArrayList();
	}
	
	
	
	
	
	@Override
	public void registerObserver(Observer o) {            // Новые наблюдатели добавляються в конец списка 
		// TODO Auto-generated method stub        
		observers.add(o);                          
	}
	
	@Override                                             //Если наблюдатель хочет отменить регистрацию мы простог удаляем его из списка
       	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}
	
	
	@Override
	public void notifyObservers() {                      //Оповещение наблюдателей об изминении состояния через метод update()
		                                                 //реализуемый всеми наблюдателми
		// TODO Auto-generated method stub
		
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);		
		}
		
		
	}
	
	public void measurementsChanged() {                  //Оповещение наблюдателей о появлении новых даных
		notifyObservers();
	}

     public void setMeasurements(float temperature, float humidity, float pressure) {
    	 this.temperature = temperature;                                               // Приложть к каждому экземпляру книги нам не разрешили,
    	 this.humidity = humidity;                                                     // поэтому вместо чтения данных с устройства мы воспользуемся 
    	 this.pressure = pressure;                                                     // тестовым методом. При желании вы можете написать код 
     }                                                                                 //для загрузки данных из интернета 
	
	
	
	
	
}
