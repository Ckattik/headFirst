package headFirstPatternModelViewController;

public class DJTestDrive {

	public static void main(String [] args) {
		
		BeatModelInterface model = BeatModel();                              // ������� ���������� ������ 
		ControllerInterface controller = new BeatControllerInterface(model); // ����� ������� ���������� � �������� ��� ������ 
	}                                                                        // �������� ��� ������������ ���������� ����������� ������ ��� 
	                                                                         // ����� ������ �� �����
	
}
