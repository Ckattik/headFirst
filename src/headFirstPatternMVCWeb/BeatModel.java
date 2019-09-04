package headFirstPatternMVCWeb;

import java.util.ArrayList;

import javax.sound.midi.Sequencer;

public class BeatModel implements BeatModelInterface {
	
	Sequencer sequencer;                          // sequencer - ��������� ����� (���� ��� �� �������) 
	ArrayList beatObservers = new ArrayList<>();  // � ����������� ArrayList ��������� ��� ��������� ������������ 
	ArrayList bpmObservers = new ArrayList<>();
	
	int bpm = 90;                                 // ������� ����� �� ���������
	
	@Override
	public void initialize() {                    // ����� ����������� ��������� � ������� ������ ��� ���������������
		// TODO Auto-generated method stub
	  setUpMidi();
	  buoldTrackAndStart();
	}
	
	@Override
	public void on() {                            // ����� on() ��������� ��������� � ������������� ������� �� ���������
		// TODO Auto-generated method stub
		sequencer.start();
		setBPM(bpm);
		
	}
	
	@Override
	public void off() {                          // ����� off() ������������� ��������� � ������ ������� ������ 0
		// TODO Auto-generated method stub
		setBPM(0);
		sequencer.stop();
	}
	
	@Override                          // ������������� ������������ ��� ���������� ������ , �� 
	public void setBPM(int bpm) {      // ��������� ��� ��������:
		// TODO Auto-generated method stub
		this.bpm = bpm;                         // (1)������������ �������� ���������� bpm                   
		sequencer.setTempoInBPM(getBPM());      // (2)������ � ���������� �� ��������� �������
		notifyBpmObservers();                   // ���������� ���� BPM - ������������ �� ��������� ������� 
		
	}
	@Override
	public int getBPM() {                       // ����� getBPM() ������ ���������� �������� ���������� bpm 
		// TODO Auto-generated method stub      // ������������ ������ ������� ����� 
		return 0;
	}
	
	public void beatEvent() {                  // ����� beatEvent() �� �������� � BeatModelIntarface ����������� MIDI - ����� ��� ������
		notifyBeatObservers();                 // ����� �����. ����� ��������� ���� ������������ BeatObserver
	}
	
	// ��� ����������� � ���������� ������������
	
	//Midi ���


}
