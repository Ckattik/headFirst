package headFirstPatternStatePartTwo;

public class GumballMachine {
	
	State soldOutState;                             // Все возможные состояния 
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;                     // Переменная экземпляра для хранения State 
	int count = 0;                                  // В переменной count храниться количество шариков - изначально автомат пуст 

	public GumballMachine(int numberGumballs) {     // Конструктор получает исходное количество шариков и сохраняет его в переменной
		// TODO Auto-generated constructor stub     // Также создает екземпляры State для всех состояний 
		soldOutState = new SoldState(this);
	    noQuarterState = new NoQuaterState(this);
		hasQuarterState = new HasQuaterState(this);
		soldState = new SoldOutState(this);
		
		this.count = numberGumballs;
		if(numberGumballs > 0) {
			state = noQuarterState;                  // Если количество шариков больше нуля то устанавливаем состояние NoQuarterState
		}
		
	}
	
	
	public void insertQuater() {                     // Действия реализуються очень просто : операция делегируеться обьекту текущего состояния 
		state.insertQuarter();
	}
	
	public void ejectQuater() {
		state.ejectQuater();
	}
	
	public void turnCrank() {                        // Для метода dispense() в классе GumballMachine метод действия не нужен потомучто это 
		state.turnCrank();                           // внутринее действие пользователь не может напрямую потребовать что бы автомат выдал шарик.
		state.dispense();                            // Однако метод disponse() для обьекта State візіваеться из метода turnCrank()
	}
	
	public void setState(State state) {              // Этот метод позволяет другим обьектам перевести автомат в другое состояние 
		this.state = state;
	}
	
	public void releaseBall() {                                         // Вспомагательный метод опускает шарик и уменьшает значение переменной
		System.out.println("A gumball comes rolling out the slot...");  // count на -1 
		if(count != 0) {
			count = count - 1;
		}
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public int getCount() {
		return count;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
		
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}
}
