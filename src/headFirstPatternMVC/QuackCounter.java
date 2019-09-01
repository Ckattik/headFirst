package headFirstPatternMVC;

public class QuackCounter implements Quackable{             // QuackCounter - ��������� 

	Quackable duck;                    // ���������� ��� �������� ������������� �������
	static int numberOfQuacks;          // ��� �������� ���� ������ ������������� ����������� ���������� 
	
	public QuackCounter(Quackable duck) {
		// TODO Auto-generated constructor stub
		
		this.duck = duck;                        // � ������������ �������� ������ �� ������������ ���������� Quackable
	}
	
	@Override
		public void quack() {
			// TODO Auto-generated method stub
		   duck.quack();                        // ����� quack() ������������� ������������ ����������� Quackable
		   numberOfQuacks++;                    // ����� ���� �������������� �������
		
		
		}
	
	public static int getQuacks() {           // ��������� ������������ ����������� ������� ������� ���������� ���������� ������ �� 
		return numberOfQuacks;                // ���� �����������
	}
	
	
}
