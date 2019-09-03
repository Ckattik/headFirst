package headFirstPatternModelViewController;

public interface BeatModelInterface {
	
	public void initialize();         // ����������� ����� �������� ���������� BeatModel
	public void on();                 // ������ ������� � ��������� ���������� �����
	public void off();
	public void setBPM(int bpm);      // ����� ������ ������� �����(����� � ������).������� ����������� ����� ����� ��� ������.
	
	 public int getBPM();             // ����� getBPM() ���������� ������� ������� ��� 0, ���� ��������� ��������
	 
	 public void registerObserver(BeatObserver o);  // ����������� �������� �� ��� ������: �� ������� ������ ����������� �                                 
	 public void removeObserver(BeatObserver o);    // ������ ����� � �� ������� ������ ����������� �� ���������� �������
	 public void registerObserver(BPMObserver o);   // ������ ����������� �������� ��� ���������� �� ���������� ���������
	 public void removeObserver(BPMObserver o);

}
