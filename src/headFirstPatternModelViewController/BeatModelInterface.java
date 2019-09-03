package headFirstPatternModelViewController;

public interface BeatModelInterface {
	
	public void initialize();         // Вызываеться после создания єкземпляра BeatModel
	public void on();                 // Методы запуска и остановки генератора ритма
	public void off();
	public void setBPM(int bpm);      // Метод задает частоту ритма(Удары в минуту).Частота изменяеться сразу после его вызова.
	
	 public int getBPM();             // Метод getBPM() возвращает текущую частоту или 0, если генератор отключен
	 
	 public void registerObserver(BeatObserver o);  // Наблюдатели деляться на две группы: те который должны оповещаться о                                 
	 public void removeObserver(BeatObserver o);    // каждом ударе и те которые должны оповещаться об изменениях частоты
	 public void registerObserver(BPMObserver o);   // Методы регистрации обьектов для оповещения об изминениях состояния
	 public void removeObserver(BPMObserver o);

}
