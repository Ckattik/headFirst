package headFirstPatternManyPatterns;

import java.util.ArrayList;
import java.util.Iterator;


/* ����� Observable ��������� ��� ���������������� ����������� 
   * Quackble ��� ����������  
   * ����� Observable ������ �����������  QuackObservable
   */


 public class Observable  implements QuackObservable{
	 
	 ArrayList observers = new ArrayList();
	 QuackObservable duck;
	 
	 public Observable(QuackObservable duck) {     // ������������ ����������� ������ QuackObservable, ������� ������������� �� ��� 
		// TODO Auto-generated constructor stub    // ���������� ������������. ���������� �� ����������� ���� ����� notify() ��� ���������� 
		 this.duck = duck;                         // Observable �������� ���� ������, ��� �� ����������� ���� � ����� ������� ���������
	}                                              // ����������� �������
	 
	 
	 @Override
	public void registerObserver(Observer observer) {     // ��� ����������� �����������
		// TODO Auto-generated method stub
		 observers.add(observer);
		 
	}
	 
	 
	 @Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		 Iterator iterator = observers.iterator();
		while(iterator.hasNext()) {                               // ��� ����������
			Observer observer = (Observer)iterator.next();
			observer.update(duck);
			
		}
	}
	 

}
