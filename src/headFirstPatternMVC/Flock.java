package headFirstPatternMVC;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{

	ArrayList quackers = new ArrayList();                // ������ ���� (Flock) �������� ArrayList ��� �������� ���������q Quackable 
	                                                     // �������� � ��� ����
	public void add(Quackable quacker) {                 // ����� add() �������� ���������� Quackable � Flock
		quackers.add(quacker);
	}
	
	public void quack() {
		Iterator iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable quacker = (Quackable)iterator.next();
			quacker.quack();                                 // ������ ����� quack() - � ����� ������, Flock ���� ��������� ����������� 
			                                                 // Quackable. ����� quack() ��� ������� Flock ������ ����������� �� ���� ����� ����
		}                                                    // �� ���������� ArrayList � �������� quack() ��� ������� ��������
	}
	
	
}
