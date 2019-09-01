package headFirstPatternDeputyDinamicPartTwo;

public class PersonBeanImpl implements PersonBean {

	String name;
	String gender;
	String interest;
	int raiting;
	int raitingCount = 0;
	
	
	
	
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public String getGender() {                   // Возвращают значения соответствующих переменных екземпляров 
		// TODO Auto-generated method stub
		return gender;
	}
	@Override
	public String getInterests() {
		// TODO Auto-generated method stub
		return interest;
	}
	@Override
	public int getHotOrNotRating() {              // ... Кроме этого метода который вычисляет среднюю оценку делением суммы на количество оценок 
		// TODO Auto-generated method stub        // raitingCount
		if(raitingCount == 0) return 0;
		
		return (raiting/raitingCount);
	}
	
	@Override
	public void setName(String name) {                 // Set- методы задают значения соответствующих переменных
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		this.gender = gender;
	}
	@Override
	public void setInterests(String interests) {
		// TODO Auto-generated method stub
		this.raiting += raiting;
		raitingCount ++;
	}
	@Override
	public void setHotOrNotRating(int rating) {        // Метод  setHotOrNotRating увеличивает значение raitingCount и прибавляет 
		// TODO Auto-generated method stub             // оценку к накапливаемой сумме
		
	}
	
	
}
