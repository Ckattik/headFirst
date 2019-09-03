package headFirstPatternModelViewController;

public class BeatController implements ControllerInterface{          // ���������� ��������� ControllerInterface 

	BeatModelInterface model;                                        // ���������� �������� ������� ������ � ������������� � ��������� �� �������
	DJView view;                             
	
	public BeatController(BeatModelInterface model) {                
		// TODO Auto-generated constructor stub
		this.model = model;
		view = new DJView (this, model); 
		view.createView();                                           // ���������� �������� ������ � ������������ � ������� ��������������
		view.createControls();
	    view.disableStopMenuItem();
	    view.enableStartMenuItem();
	    model.initialize();
	
	}
	
	
	@Override
		public void start() {                                    // ��� ������ ������� Start ���������� ������������ ������ � �������� 
		                                                         // ���������������� ��������� : ������� Start ������������, � ������� 
			// TODO Auto-generated method stub                   // Stop ����������� ���������
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();                   //��������!!! ��� �������� ������� �� ������������� ��������� ����������.������������� 
		}                                            // ����� ������ ������������� � ������� ���������� ������ ����; ��� �� ����� 
	                                                 // � ����� ��������� ��� ������� ������ 
	@Override
		public void stop() {                                    // � �������� ��� ����� ������� ����������� �������������� ������, 
			// TODO Auto-generated method stub                  // ������� Start ����������� ���������, � ������� Stop ������������ 
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		}
	
	@Override
	public void increaseBPM() {                         // ��� ������ �� ������ ���������� ���������� �������� ������� ������� �� ������ 
		// TODO Auto-generated method stub              // ����������� �� �� 1 � ������ ��������� ��� ����� �������� �������
	    int bpm = model.getBPM();                       
	    model.setBPM(bpm + 1);
	}
	
	@Override
		public void decreaseBPM() {                      // ���� ����� ������ ������� ������������ �� 1 
			// TODO Auto-generated method stub
		int bpm = model.getBPM();
		model.setBPM(bpm - 1); 
		}
	
	public void setBPM(int bpm) {                       // ������� ���� ���������� ���� ������������ �������, ���������� ����������� ������ 
		model.setBPM(bpm);                              // ������� �� ����� ��������
	}
	
	
}
