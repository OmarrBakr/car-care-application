package Control;

import java.util.Scanner;

import Entity.User;
import Entity.Worker;
import Enum.PaymentMethod;

public class CleanOutManager {
	public double calculatePrice(Service service, double area) {
		return service.cost(area);
	}
	public void cleanOut(CarCareCenter carCareCenter) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your ticket number: ");
		int id = in.nextInt();
		for(User user : carCareCenter.getUsers()) {
			if(user.getVehicle().getUID() == id) {
				user.setFinished(true);
				for(Worker worker : carCareCenter.getWorkers()) {
					if(worker.getUser().getVehicle().getUID() == user.getVehicle().getUID())
						worker.setAvailable(true);
				}
				double toPay = calculatePrice(user.getService() , (user.getVehicle().getLength()*user.getVehicle().getWidth()));
				System.out.println("You ordered: " + user.getService().getDescription());
				System.out.println("The total cost is " + toPay);
				carCareCenter.setTotalIncome(carCareCenter.getTotalIncome()+toPay);
				carCareCenter.setTotalVehicles(carCareCenter.getTotalVehicles()+1);
				System.out.print("Choose a payment method:\n"
						+ "1.Cash\n"
						+ "2.Credit Card\n"
						+ "Enter your choice: ");
				int choice = in.nextInt();
				switch(choice) {
					case 1:
						user.setPaymentMethod(PaymentMethod.CASH);
						System.out.println("Payment is done via CASH method");
						break;
					case 2:
						user.setPaymentMethod(PaymentMethod.CREDIT_CARD);
						System.out.println("Payment is done via Credit Card method");
						break;
					default:
						user.setPaymentMethod(PaymentMethod.CASH);
						System.out.println("Payment is done via CASH method");
				}
				if(!carCareCenter.getWaitingList().getUsersWaitingList().isEmpty()) {
					CleanInManager cleanInManager = new CleanInManager();
					cleanInManager.cleanIn(carCareCenter,user);
				}
				return;
			}
		}
		System.out.println("Your ticket info is incorrect!\n"
				+ "Please try again");
		return;
	}
}
