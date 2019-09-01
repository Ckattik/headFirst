package headFirstPatternDeputyDinamicPartTwo;



public interface PersonBean {

	String getName();                      // Получение информации о кандидате : имя, пол, увлечение и оценка(1-10)
	String getGender();
	String getInterests();
	int getHotOrNotRating();
	
	
	void setName(String name);             // Методы записи техже данных 
	void setGender(String gender);
	void setInterests(String interests);  
	void setHotOrNotRating(int rating);    // Метод получает целое число и включает его в накапливаемую среднюю оценку кандидата
	
	
	
	
}
