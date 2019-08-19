package headFirstPatternState;

public class GumballMachine {
	
	final static int SOLD_OUT = 0;         // „етыре состо€ни€
	final static int NO_QUATER = 1;
	final static int HAS_QUATER = 2;
	final static int SOLD = 3;

    int state = SOLD_OUT;                // ѕеременна€ екземпл€ра в котором будет хранитьс€ текушее состо€ние. »нициализируетьс€ переменной SOLD_OUT
    int count = 0;                       // ¬о второй переменной хранитьс€ количество шариков в автомате  


    public GumballMachine(int count) {           //  онструктор получает исходное количество шариков.≈сли оно отлично от нул€ то автомат переходит в 
 		// TODO Auto-generated constructor stub  // состо€ние NO_QUATER, ожида€ пока кто нибудь бросит монетку; в противном случае автомат 
    	if(count > 0) {                          // остаетьс€ в состо€нии SOLD_OUT
    		state = NO_QUATER;
    	}
	}
    
    
                                               // Ќачинаем реализововать действи€ в виде методов 
    
    public void insertQuarter() {                                      //  огда в автомат бросают монетку если ... 
    	if(state == HAS_QUATER) {                                      // ...¬ автомате уже есть монетка мы сообщаем об этом покупателю; 
    		System.out.println("You can`t insert another quater");      
    	}else if(state == NO_QUATER) {                                 // ¬ противном случае автомат получает монетку и переходит в состо€ние HAS_QUATER; 
    		System.out.println("You inserted a quater");
    		state = HAS_QUATER;
    	}else if(state == SOLD_OUT) {                                               // ≈сли все щшарики разпроданы автомат отклон€ет монетку                                 
    		System.out.println("You can insert a quater, the machin is sold out");
    	}else if(state == SOLD) {                                                   // ≈сли шарик был куплен следует продолжать завершение орперации
    		System.out.println("Please wait, we are already giving you a gumball"); // прежде чем бросать другую монетку
    		
    	}
    } 	
    	public void ejectQuater() {                               // ≈сли покупатель пытаетьс€ вернуть монетку ...                                 
    		if(state == HAS_QUATER) {                                       
        		System.out.println("Quater returned");            // ≈сли монетка есть автомат возвращает ее и переходит в состо€ние NO_QUATER
        		state = NO_QUATER;
        	}else if(state == NO_QUATER) {                                  // ≈сли монетки нету то вернуть ее невозможно 
        		System.out.println("You have not inserted a quater");       // Ўарик уже куплен возврат не возможен
        	}else if(state == SOLD) {                                                                    
        		System.out.println("Sorry you already turned the crank");
        	}else if(state == SOLD_OUT) {                                   // ≈сли шарики закончились возврат невозможен-автомат не принимает монетки                
        		System.out.println("You can not aject, you have not inserted a quater yet");
        		
        	}	
    	}
    	
    	
    	public void turnCrank() {                                                    // ѕокупатель пытаетьс€ дернуть за рычаг
    		if(state == SOLD) {                                                      //  то то пытаетьс€ обмануть автомат 
    			System.out.println("Turning twice does`t get you another gumball");   
    		}else if(state == NO_QUATER) {                                           // —начала нужно бросить монетку
    			System.out.println("You turned but there is no quater");
    		 
    		}else if(state == SOLD_OUT) {                                            // ¬ыдача не возможна в автомате нет шариков 
    			System.out.println("You turned but there are not gumballs");
    		}else if(state == HAS_QUATER) {                                          // ѕокупатель получает шарик переходим в состо€ние SOLD и
        		System.out.println("You turned ...");                                // вызываем метод dispense()
            	state = SOLD;
            	dispense();
    		}
    	
    	}
    	
    	
    	
    	public void dispense() {
    		if(state == SOLD) {                                                 // јвтомат в состо€нии SOLD выдать покупку 
    			System.out.println("A gumball comes rolling out the slot");
    			count = count - 1;
    			if(count == 0) {                                                // ≈сли шарик был последним автомат переходит в состо€ние SOLD_OUT
    				System.out.println("Oops, out of gumballs!");               // а если нет возвращаемс€ к сосото€нию нет монет
    				state = SOLD_OUT;
    			}else {
    				state = NO_QUATER;
    			}
    		}else if(state == NO_QUATER) {                                       // ¬се это не должно происходить но если это произойдет автомат выдаст ошибку
    			System.out.println("You need to pay first");
    		}else if(state == SOLD_OUT) {
    			System.out.println("No gumball dispensed");
    		}else if(state == HAS_QUATER) {
    			System.out.println("No gumball dispensed");
    		}
    	}
    
    
}

