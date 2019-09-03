package headFirstPatternManyPatterns;

import java.util.ArrayList;
import java.util.Iterator;


public class Flock implements Quackable{

	Observable observable;
	
	
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
	
	@Override
	public void registerObserver(Observer observer) {       // ��� ����������� Flock ��� ����������� ������������� ��������������� ���  
		// TODO Auto-generated method stub                  // ��� ����������� �� Flock - ������ ��� ���������� Quackable ���� �� Duck 
		Iterator iterator = quackers.iterator();            // ��� ������ ������ Flock
		while(iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();    // ���������� ��� ���������� Quackables � Flock � ���������� ����� ������� ������� 
			duck.registerObserver(observer);                // ���� ���������� Quackable ������������ ����� Flock �� �� ����� ���������� �� ��������� 
		}                                                   // ������
		
		
	}
	
	@Override
	public void notifyObservers() {                         // ������ ���������� Quackable ��������� ���������� �������������� ������� Flock
		// TODO Auto-generated method stub                  // ������ ������ �� ���������� 
		
	}
}
