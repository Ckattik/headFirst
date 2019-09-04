package headFirstPatternModelViewController;

import java.util.ArrayList;

import javax.sound.midi.*;
import java.util.*;

public class BeatModel  implements BeatModelInterface, MetaEventListener{

    Sequencer sequencer;	
    
	Sequence sequence;                          // sequencer - генератор ритма (того что вы слышите) 
	Track track;
	
	ArrayList beatObservers = new ArrayList<>();  // В контейнерах ArrayList храниться две категории наблюдателей 
	ArrayList bpmObservers = new ArrayList<>();
	
	int bpm = 90;                                 // Частота ритма по умолчанию
	
	@Override
	public void initialize() {                    // Метод настраивает генератор и готовит музыку для воспроизвидения
		// TODO Auto-generated method stub
	  
	  setUpMidi();
	  buildTrackAndStart();
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
		notifyBPMObservers();                   // Оповещение всех BPM - наблюдателей об изминении частоты 
		
	}
	@Override
	public int getBPM() {                       // Метод getBPM() просто возвращает значение переменной bpm 
		// TODO Auto-generated method stub      // определяющюю текщюю частоту ритма 
		return bpm;
	}
	
	public void beatEvent() {                  // Метод beatEvent() не входящий в BeatModelIntarface вызываеться MIDI - кодом при каждом
		notifyBeatObservers();                 // новом ударе. Метод оповещает всех наблюдателей BeatObserver
	}
	
	
	
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}
	
	
	public void notifyBeatObservers() {
		for(int i = 0; i <beatObservers.size(); i++) {
		
			BeatObserver observer = (BeatObserver) beatObservers.get(i);
			observer.updateBeat();
			
		}
	}
	
	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}
	
	
	
	public void notifyBPMObservers() {
		for(int i = 0; i < bpmObservers.size(); i++) {
			
			BPMObserver observer = (BPMObserver) bpmObservers.get(i);
			observer.updateBPM();
			
		}
		
	}
	
	
	public void removeObserver(BeatObserver o) {
		
		int i = beatObservers.indexOf(o);
		if(i >= 0) {
			beatObservers.remove(i);
		}
		
	}
	
	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if(i >= 0) {
			bpmObservers.remove(i);
		}
		
	}
		
		public void meta(MetaMessage message) {
			if(message.getType() == 47) {
				beatEvent();
				sequencer.start();
				setBPM(getBPM());
				
			}
			
		}
			public void setUpMidi() {
				try {
					sequencer = MidiSystem.getSequencer();
					sequencer.open();
					sequencer.addMetaEventListener(this);
					sequence = new Sequence(Sequence.PPQ, 4);
					track = sequence.createTrack();
					sequencer.setTempoInBPM(getBPM());
					
					
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
			
			
			
			
			public void buildTrackAndStart() {
				int [] trackList = {35, 0, 46, 0};
			
		     
			sequence.deleteTrack(null);
			 track = sequence.createTrack();
			 
			 makeTracks(trackList);
			 track.add(makeEvent(192, 9, 1, 0, 4));
		     try {
		    	 
		    	 sequencer.setSequence(sequence);
		    	 
		     }catch(Exception ex) {
		    	 ex.printStackTrace();
		     }
		
			}
			
			
			
			public void makeTracks(int [] list) {
				
				for(int i = 0; i < list.length; i++) {
					int key = list[i];
					if(key != 0) {
						track.add(makeEvent(144, 9, key, 100, i));
						track.add(makeEvent(128, 9, key, 100, i + 1));
					
					
					}
				}
				
			}
			
			
			public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
				MidiEvent event = null;
				try {
					
					ShortMessage a = new ShortMessage();
					a.setMessage(comd, chan, one, two);
					event = new MidiEvent(a,tick);
					
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				return event;
			}

						
			
			

			
			
	}
	
	
	// Код регистрации и оповещения наблюдателей
	
	//Midi код

