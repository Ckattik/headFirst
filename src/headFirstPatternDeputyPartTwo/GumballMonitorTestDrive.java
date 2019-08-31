package headFirstPatternDeputyPartTwo;

import java.rmi.Naming;

public class GumballMonitorTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] location = {"rmi://santafe.mightygumball.com//gumballmachine" ,  // ћестонахождени€ всех автоматов которые мы собираемс€ отслеживать
				              "rmi://boulder.mightygumball.com//gumballmachine" ,  // —оздаем массив местонахождений по одному дл€ каждого автомата 
		                      "rmi://seattle.mightygumball.com//gumballmachine" };
		
		
		
		GumballMonitor [] monitor = new GumballMonitor[location.length];             // “акже создаем масив мониторов
		
		for(int i = 0; i < location.length; i ++) {
			try {
				
				GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
				monitor[i] = new GumballMonitor(machine);                              // “еперь нужно получить заместител€ дл€ каждого автомата 
				System.out.println(monitor[i]);
				
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		for(int i = 0; i < monitor.length; i ++) {     // ѕеребираем автоматы и дл€ каждого автомата выводим отчет
			monitor[i].report();
		}
		
		
	}

}
