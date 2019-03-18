package headFirst_Pattern_Observer;

public interface Subject { 

	public void registerObserver(Observer o);     // получает в аргументе реализацию Observer(регистрируемый или исключаемый наблюдатель) 
	public void removeObserver(Observer o);       // получает в аргументе реализацию Observer(регистрируемый или исключаемый наблюдатель)
	public void notifyObserver();               //для оповещения наблюдателей об состоянии субьекта
	
	
	
}
