package headFirstPatternModelViewController;

public interface ControllerInterface {  // Методы контроллера которые могут вызываться представлением 

	public void start();                // После изучения визуального интерфейса модели эти методы выглядят знакомо 
	public void stop();                 // Они выполняют те же операции : Запуск и остановка ритма,
	public void increaseBPM();          // изминение частоты. Этот интерфейс "шире" интерфеса BeatModel, 
	public void decreaseBPM();          // потому что в нем присутствует возможность увеличения и уменшения частоты
	public void setBPM(int bpm);
	
}
