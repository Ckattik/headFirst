package headFirstPatternManyPatterns;


/* ����������� ������ ����������� ��������� Observer
 * ����� ��� �� �������� ���������������� � QuackObserveble
 */



public class Quackologolist implements Observer {
                                                     // ����� ����������� ����� ������������ ����� update() �������
	                                                 // ���������� � ���������� Quackable �� ������� ��������� ����������
	
	@Override                                                       
	public void update(QuackObservable duck) {
		// TODO Auto-generated method stub
		System.out.println("Quackologist: " + duck + "just quacked.");
	}
}
