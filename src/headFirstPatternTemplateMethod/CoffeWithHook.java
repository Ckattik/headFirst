package headFirstPatternTemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeWithHook extends CaffeinBeverage {

	@Override
	void brew() {
		// TODO Auto-generated method stub
	
		System.out.println("Dripping Coffee throught filter");
	}
	
	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding sugar and milk");
	}
	
	@Override
	public boolean custumerWantCondiments() {
		// TODO Auto-generated method stub
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}
		
		return false;
	}
	
	private String getUserInput() {
		String answer = null;
		
		System.out.print("Would you like milk and sugar with your coffe (y/n) ?");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		}catch(IOException ioe) {
			System.out.println("IO Erorr trying to read your answer");
		}
		if(answer == null) {
			System.out.println("I am not sugar and milk");
			return "no";
			
		}
		
		return answer;
	}
	
	
}
