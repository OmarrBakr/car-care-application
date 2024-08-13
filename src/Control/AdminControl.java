package Control;

import Entity.Worker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AdminControl {
	public void addOffer(OffersManager offersManager) {
		System.out.println();
	}
	public void removeOffer(OffersManager offersManager) {
		
	}
	public void viewOffers(OffersManager offersManager) {
		
	}
	public void addWorker(CarCareCenter carCareCenter) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String name = in.nextLine();
		Worker worker = new Worker(name);
		carCareCenter.getWorkers().add(worker);
	}
	public void removeWorker(CarCareCenter carCareCenter) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String name = in.nextLine();
		for (Iterator<Worker> iterator = carCareCenter.getWorkers().iterator(); iterator.hasNext(); ) {
    	    Worker worker = iterator.next();
    	    if (worker.getName() == name) {
    	        iterator.remove();
    	    }
    	}
	}
	public void viewWorkers(CarCareCenter carCareCenter) {
		for(Worker worker : carCareCenter.getWorkers()) {
			System.out.println(worker.getName());
		}
	}
}
