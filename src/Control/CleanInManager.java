package Control;

import java.util.Scanner;

import Entity.User;
import Entity.Vehicle;
import Entity.Worker;
import Enum.*;

public class CleanInManager {
	public void cleanIn(CarCareCenter carCareCenter){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter vehicle model name: ");
		String name = in.nextLine();
		System.out.print("Enter vehicle model year: ");
		String year = in.nextLine();
		System.out.print("Enter vehicle length: ");
		double length = in.nextDouble();
		System.out.print("Enter vehicle width: ");
		double width = in.nextDouble();
		System.out.print("Passenger Type:\n"
				+ "1.Regular\n"
				+ "2.Kids\n"
				+ "3.Elderly\n"
				+ "Enter your choice: ");
		int choice = in.nextInt();
		PassengerType passengerType = PassengerType.REGULAR;
		switch(choice) {
			case 1:
				passengerType = PassengerType.REGULAR;
				break;
			case 2:
				passengerType = PassengerType.KIDS;
				break;
			case 3:
				passengerType = PassengerType.ELDERLY;
				break;
		}
		Service service = new CleanInService();
		while(true) {
		System.out.print("1.Add tires change service\n"
				+ "2.Add oil change service\n"
				+ "3.Add car maintenance service\n"
				+ "4.Confirm order\n"
				+ "Enter your choice: ");
		int choice1 = in.nextInt();
		if(choice1==1) {
			System.out.print("1.Bridgestone Tires Service\n"
					+ "2.Michelin Tires Service\n"
					+ "Enter your choice: ");
			int choice2 = in.nextInt();
			if(choice2 == 1) {
				service = new BridgestoneTiresService(service);
			}
			else if(choice2 == 2) {
				service = new MichelinTiresService(service);
			}
		}
		else if(choice1==2){
			System.out.print("1.Shell Oil Service\n"
					+ "2.Mobile Oil Service\n"
					+ "Enter your choice: ");
			int choice2 = in.nextInt();
			if(choice2 == 1) {
				service = new ShellOilService(service);
			}
			else if(choice2 == 2) {
				service = new MobilOilService(service);
			}
		}
		else if(choice1==3){
			System.out.print("1.Hyundai Maintenance Service\n"
					+ "2.Toyota Maintenance Service\n"
					+ "Enter your choice: ");
			int choice2 = in.nextInt();
			if(choice2 == 1) {
				service = new HyundaiMaintenanceService(service);
			}
			else if(choice2 == 2) {
				service = new ToyotaMaintenanceService(service);
			}
		}
		else if(choice1==4){
			break;
		}
		else {
			System.out.println("Enter valid option!");
		}
		}
		for(Worker e:carCareCenter.getWorkers()){
			if(e.isAvailable()) {
				User user = new User(new Vehicle(name,length,width,year,passengerType));
				user.setService(service);
				carCareCenter.getUsers().add(user);
				e.setAvailable(false);
				e.setUser(user);
				System.out.println("Your ticket number is #" + user.getVehicle().getUID());
				return;
			}
		}
		System.out.print("Looks like all workers are busy right now!\n"
				+ "Would you like to subscribe to a waiting list?\n"
				+ "1.Yes\n"
				+ "2.No\n"
				+ "Enter your choice: ");
		int choice1 = in.nextInt();
		switch(choice1) {
			case 1:
				User user = new User(new Vehicle(name,length,width,year,passengerType));
				user.setService(service);
				carCareCenter.getWaitingList().getUsersWaitingList().add(user);
				break;
			case 2:
				return;
			default:
				return;
		}
		return;
	}
	
	public void cleanIn(CarCareCenter carCareCenter, User user) {
		for(Worker e:carCareCenter.getWorkers()){
			if(e.isAvailable()) {
				carCareCenter.getUsers().add(user);
				e.setAvailable(false);
				e.setUser(user);
				System.out.println("Your ticket number is #" + user.getVehicle().getUID());
			}
		}
	}
}
