package headFirst_Pattern_Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
 
	
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WeatherData() {
		observers = new ArrayList(); // добавлен контейнер ArrayList для хранения наблюдателей
	}
	
	
	
     public void registerObserver(Observer o) {
	// TODO Auto-generated method stub
	observers.add(o);                                 // новые наблюдатели просто добавляються в конец списка
    	 
}

@Override
		public void removeObserver(Observer o) {
			// TODO Auto-generated method stub
			
	        int i = observers.indexOf(o);
	        if(i >= 0) {
	        	observers.remove(i);              //если наблюдатель хочет отменить регистрацию мы просто удаляем из списка ArrayList
	        }
	
		}	
	
	
@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
	 for(int i = 0; i < observers.size(); i++) {                //оповещение наблюдателей об изменении состояния через метод update, 
		                                                        //реализуемый всеми наблюдателями
		 Observer observer = (Observer)observers.get(i);
		 observer.update(temperature, humidity, pressure);
	 }
	      
	 
} 
	 
	 public void meashurementsChanged() {                      //оповещение наблюдателей о появлении новых данных
 		 notifyObserver();
	 }
	 

	 
	 public void setMesurements(float temperature, float humidity, float pressure) {
		 
		 this.temperature = temperature;                 // приложить к каждому экземпляру книги нам не разрешили поэтому вместо чтения данных
		 this.humidity = humidity;                       // c устройства мы воспользуемся тестовым методом 
		 this.pressure = pressure;
		 
		 meashurementsChanged();
	 }
		
	


}
