package headFirstPatternManyPatterns;



public interface QuackObservable {                    // ����� �� Quackable ����� ���� ��������� ��� ������ ����������� ��������� QuackObservable
	
	public void registerObserver(Observer observer); // ����� ����������� ������������.����� ����� ����������� ��������� Observer
                                                     // ������ �������� ���������� 
	public void notifyObservers();                   // ����� �������� ����� ���������� ������������
	
	
}
