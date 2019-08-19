package headFirstPatternState;

public class GumballMachine {
	
	final static int SOLD_OUT = 0;         // ������ ���������
	final static int NO_QUATER = 1;
	final static int HAS_QUATER = 2;
	final static int SOLD = 3;

    int state = SOLD_OUT;                // ���������� ���������� � ������� ����� ��������� ������� ���������. ����������������� ���������� SOLD_OUT
    int count = 0;                       // �� ������ ���������� ��������� ���������� ������� � ��������  


    public GumballMachine(int count) {           // ����������� �������� �������� ���������� �������.���� ��� ������� �� ���� �� ������� ��������� � 
 		// TODO Auto-generated constructor stub  // ��������� NO_QUATER, ������ ���� ��� ������ ������ �������; � ��������� ������ ������� 
    	if(count > 0) {                          // ��������� � ��������� SOLD_OUT
    		state = NO_QUATER;
    	}
	}
    
    
                                               // �������� ������������� �������� � ���� ������� 
    
    public void insertQuarter() {                                      // ����� � ������� ������� ������� ���� ... 
    	if(state == HAS_QUATER) {                                      // ...� �������� ��� ���� ������� �� �������� �� ���� ����������; 
    		System.out.println("You can`t insert another quater");      
    	}else if(state == NO_QUATER) {                                 // � ��������� ������ ������� �������� ������� � ��������� � ��������� HAS_QUATER; 
    		System.out.println("You inserted a quater");
    		state = HAS_QUATER;
    	}else if(state == SOLD_OUT) {                                               // ���� ��� ������� ���������� ������� ��������� �������                                 
    		System.out.println("You can insert a quater, the machin is sold out");
    	}else if(state == SOLD) {                                                   // ���� ����� ��� ������ ������� ���������� ���������� ���������
    		System.out.println("Please wait, we are already giving you a gumball"); // ������ ��� ������� ������ �������
    		
    	}
    } 	
    	public void ejectQuater() {                               // ���� ���������� ��������� ������� ������� ...                                 
    		if(state == HAS_QUATER) {                                       
        		System.out.println("Quater returned");            // ���� ������� ���� ������� ���������� �� � ��������� � ��������� NO_QUATER
        		state = NO_QUATER;
        	}else if(state == NO_QUATER) {                                  // ���� ������� ���� �� ������� �� ���������� 
        		System.out.println("You have not inserted a quater");       // ����� ��� ������ ������� �� ��������
        	}else if(state == SOLD) {                                                                    
        		System.out.println("Sorry you already turned the crank");
        	}else if(state == SOLD_OUT) {                                   // ���� ������ ����������� ������� ����������-������� �� ��������� �������                
        		System.out.println("You can not aject, you have not inserted a quater yet");
        		
        	}	
    	}
    	
    	
    	public void turnCrank() {                                                    // ���������� ��������� ������� �� �����
    		if(state == SOLD) {                                                      // ��� �� ��������� �������� ������� 
    			System.out.println("Turning twice does`t get you another gumball");   
    		}else if(state == NO_QUATER) {                                           // ������� ����� ������� �������
    			System.out.println("You turned but there is no quater");
    		 
    		}else if(state == SOLD_OUT) {                                            // ������ �� �������� � �������� ��� ������� 
    			System.out.println("You turned but there are not gumballs");
    		}else if(state == HAS_QUATER) {                                          // ���������� �������� ����� ��������� � ��������� SOLD �
        		System.out.println("You turned ...");                                // �������� ����� dispense()
            	state = SOLD;
            	dispense();
    		}
    	
    	}
    	
    	
    	
    	public void dispense() {
    		if(state == SOLD) {                                                 // ������� � ��������� SOLD ������ ������� 
    			System.out.println("A gumball comes rolling out the slot");
    			count = count - 1;
    			if(count == 0) {                                                // ���� ����� ��� ��������� ������� ��������� � ��������� SOLD_OUT
    				System.out.println("Oops, out of gumballs!");               // � ���� ��� ������������ � ���������� ��� �����
    				state = SOLD_OUT;
    			}else {
    				state = NO_QUATER;
    			}
    		}else if(state == NO_QUATER) {                                       // ��� ��� �� ������ ����������� �� ���� ��� ���������� ������� ������ ������
    			System.out.println("You need to pay first");
    		}else if(state == SOLD_OUT) {
    			System.out.println("No gumball dispensed");
    		}else if(state == HAS_QUATER) {
    			System.out.println("No gumball dispensed");
    		}
    	}
    
    
}

