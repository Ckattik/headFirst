package arraysSort;

public class Duck implements Comparable {   // ��� ����������� ������� ��������������� ����� ������ ����������� �������� Comparable
	
	String name;
	int weight;
	
	public Duck(String name,int weight) {
		// TODO Auto-generated constructor stub
	  this.name = name;
	  this.weight = weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " weight " + weight;
	}
	
	
	@Override
	public int compareTo(Object object) {              // ����� ��������� ��� ����������
		// TODO Auto-generated method stub
		Duck otherDuck = (Duck)object;              //����� CompareTo() �������� ������ ������ Duck � ���������� ��� � ������� ��������  Duck
		
		if(this.weight < otherDuck.weight) {        // ����� ������������� ������� ��������� �������� Duck ���� �������� ���������� weight 
			return -1;                              // �������� ������� Duck ������ �������� weight ������� otherDuck, ����� ���������� -1;
		}else if(this.weight == otherDuck.weight) { // ���� ��� ����� ���������� 0; � ���� ������ ���������� 1;
			return 0;
		}else { 
			// this.weight > otherDuck.weight
			return 1;
			
		}
		
		
		
		
	}

	
	
	
}
