package headFistPatternCommandPartTwo;
// ���������� ������ �� 7 ������ 
public class RemoteControl {
	
	Command [] onCommands;   // � ���� ������ ����� ����� ������������ ��� 7 ������ ���/���� ������� �����
	Command [] offCommands;   // ��������� � ��������������� �������
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
	}

}
