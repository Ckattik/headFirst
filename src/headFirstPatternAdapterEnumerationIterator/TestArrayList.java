package headFirstPatternAdapterEnumerationIterator;

import java.util.ArrayList;
import java.util.Iterator;


public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeadFirstAdapterIteratorEnumerationPartTwo hr = null;
		
		ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
         
        Iterator<String> iter = states.iterator();
        while(hr.hasMoreElements()){
         
            System.out.println(hr.nextElement());
        }
		
		
	}

}
