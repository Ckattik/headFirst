package headFirstPatternDeputyRemotePartTwo;

import java.io.Serializable;

public interface State extends Serializable {   // ������ ��������� ���������� Serializable ������� �� ����� ������� - � ������ ������ State  
                                                // �� ���� ���������� ����� ������������ �� ����.
	public void insertQuater();
	public void ejectQuater();
	public void turnCrank();
	public void despense();
	
}
