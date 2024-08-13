package Boundary;

import java.util.Scanner;

import Control.*;
import Entity.*;

public class Client {
	public static void main(String[] args) {
		CarCareCenter carCareCenter = new CarCareCenter();
		CleanInManager cleanInManager = new CleanInManager();
		CleanOutManager cleanOutManager = new CleanOutManager();
		OffersManager offersManager = new OffersManager();
		AdminControl adminControl = new AdminControl();
		Scanner in = new Scanner(System.in);
		while(true) {
		System.out.print("1.Customer\n"
				+ "2.Admin\n"
				+ "3.Exit\n"
				+ "Enter your choice: ");
		int choice = in.nextInt();
		if(choice==1) {
			while(true) {
				System.out.print("1.Clean-in\n"
						+ "2.Clean-out\n"
						+ "3.Change user\n"
						+ "Enter your choice: ");
				int choice1 = in.nextInt();
				if(choice1==1) {
					cleanInManager.cleanIn(carCareCenter);
				}
				else if(choice1==2) {
					cleanOutManager.cleanOut(carCareCenter);
				}
				else if(choice1==3) {
					break;
				}
				else {
					System.out.println("Enter valid choice!");
				}
			}
		}
		else if(choice==2) {
			while(true) {
			System.out.print("1.Change waiting list strategy\n"
					+ "2.Add worker\n"
					+ "3.Remove worker\n"
					+ "4.View workers\n"
					+ "5.Add offer\n"
					+ "6.Remove offer\n"
					+ "7.View offers\n"
					+ "8.Calculate total revenue\n"
					+ "9.Calculate total vehicles\n"
					+ "10.Change user\n"
					+ "Enter your choice: ");
			int choice1 = in.nextInt();
			if(choice1==1) {
				System.out.print("1.First come first served\n"
						+ "2.Special passengers fit\n"
						+ "Enter your choice: ");
				int choice2 = in.nextInt();
				if(choice2==1) {
					carCareCenter.getWaitingList().setListStrategy(new FirstComeFirstServedStrategy());
				}
				else if(choice==2) {
					carCareCenter.getWaitingList().setListStrategy(new SpecialPassengerStrategy());
				}
			}
			else if(choice1==2) {
				adminControl.addWorker(carCareCenter);
			}
			else if(choice1==3) {
				adminControl.removeWorker(carCareCenter);
			}
			else if(choice1==4) {
				adminControl.viewWorkers(carCareCenter);
			}
			else if(choice1==5) {
				
			}
			else if(choice1==6) {
				
			}
			else if(choice1==7) {
				
			}
			else if(choice1==8) {
				System.out.println("Total income: " + carCareCenter.getTotalIncome());
			}
			else if(choice1==9) {
				System.out.println("Total vehicles: " + carCareCenter.getTotalVehicles());
			}
			else if(choice1==10) {
				break;
			}
		}}
		else if(choice==3) {
			break;
		}
	}
}
}
