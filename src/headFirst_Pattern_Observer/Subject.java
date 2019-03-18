package headFirst_Pattern_Observer;

public interface Subject { 

	public void registerObserver(Observer o);     // �������� � ��������� ���������� Observer(�������������� ��� ����������� �����������) 
	public void removeObserver(Observer o);       // �������� � ��������� ���������� Observer(�������������� ��� ����������� �����������)
	public void notifyObserver();               //��� ���������� ������������ �� ��������� ��������
	
	
	
}
