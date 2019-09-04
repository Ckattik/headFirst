package headFirstPatternMVCWeb;

import java.util.ArrayList;

import javax.sound.midi.Sequencer;

public class BeatModel implements BeatModelInterface {
	
	Sequencer sequencer;                          // sequencer - генератор ритма (того что вы слышите) 
	ArrayList beatObservers = new ArrayList<>();  // В контейнерах ArrayList храниться две категории наблюдателей 
	ArrayList bpmObservers = new ArrayList<>();
	
	int bpm = 90;                                 // Частота ритма по умолчанию
	
	@Override
	public void initialize() {                    // Метод настраивает генератор и готовит музыку для воспроизвидения
		// TODO Auto-generated method stub
	  setUpMidi();
	  buoldTrackAndStart();
	}
	
	@Override
	public void on() {                            // Метод on() запускает генератор и устанавливает частоту по умолчанию
		// TODO Auto-generated method stub
		sequencer.start();
		setBPM(bpm);
		
	}
	
	@Override
	public void off() {                          // Метод off() останавливает генератор и задает частоту равной 0
		// TODO Auto-generated method stub
		setBPM(0);
		sequencer.stop();
	}
	
	@Override                          // Используеться контроллером для управления ритмом , он 
	public void setBPM(int bpm) {      // выполняет три операции:
		// TODO Auto-generated method stub
		this.bpm = bpm;                         // (1)Присваивание значение переменной bpm                   
		sequencer.setTempoInBPM(getBPM());      // (2)Запрос к генератору на изминение частоты
		notifyBpmObservers();                   // Оповещение всех BPM - наблюдателей об изминении частоты 
		
	}
	@Override
	public int getBPM() {                       // Метод getBPM() просто возвращает значение переменной bpm 
		// TODO Auto-generated method stub      // определяющюю текщюю частоту ритма 
		return 0;
	}
	
	public void beatEvent() {                  // Метод beatEvent() не входящий в BeatModelIntarface вызываеться MIDI - кодом при каждом
		notifyBeatObservers();                 // новом ударе. Метод оповещает всех наблюдателей BeatObserver
	}
	
	// Код регистрации и оповещения наблюдателей
	
	//Midi код


}
