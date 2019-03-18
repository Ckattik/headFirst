package headFirst_Pattern_Observer;

public interface Observer {

	public void update(float temp, float humidity, float pressure);   // интерфейс Observe реализуетьс€ всеми наблюдател€ми, таким образом
	                                                                  //  все наблюдатели должны реализововать метод update();
	                                                                  //ƒанные состо€ни€, передаваемые наблюдател€м при изменении состо€ни€ обьект	а
	
	
}
