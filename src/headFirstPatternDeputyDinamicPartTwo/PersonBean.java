package headFirstPatternDeputyDinamicPartTwo;



public interface PersonBean {

	String getName();                      // ��������� ���������� � ��������� : ���, ���, ��������� � ������(1-10)
	String getGender();
	String getInterests();
	int getHotOrNotRating();
	
	
	void setName(String name);             // ������ ������ ����� ������ 
	void setGender(String gender);
	void setInterests(String interests);  
	void setHotOrNotRating(int rating);    // ����� �������� ����� ����� � �������� ��� � ������������� ������� ������ ���������
	
	
	
	
}
