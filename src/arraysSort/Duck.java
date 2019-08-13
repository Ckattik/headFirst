package arraysSort;

public class Duck implements Comparable {   // При отсутствиии реально субкласирования класс должен реализовать инерфейс Comparable
	
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
	public int compareTo(Object object) {              // метод необходим для сортировки
		// TODO Auto-generated method stub
		Duck otherDuck = (Duck)object;              //Метод CompareTo() получает другой обьект Duck и сравнивает его с ТЕКУЩИМ обьектом  Duck
		
		if(this.weight < otherDuck.weight) {        // Здесь определяеться правило сравнение обьектов Duck Если значение переменной weight 
			return -1;                              // ТЕКУЩЕГО обьекта Duck меньше значения weight обьекта otherDuck, метод возвращает -1;
		}else if(this.weight == otherDuck.weight) { // если они равны возвращает 0; а если больше возвращает 1;
			return 0;
		}else { 
			// this.weight > otherDuck.weight
			return 1;
			
		}
		
		
		
		
	}

	
	
	
}
