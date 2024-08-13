package Control;

import java.util.ArrayList;

import Entity.User;
import Enum.PassengerType;

public class SpecialPassengerStrategy implements WaitingListStrategy{

	@Override
	public User execute(CarCareCenter carCareCenter) {
		ArrayList<User> users = new ArrayList<User>();
		for(User user : carCareCenter.getWaitingList().getUsersWaitingList()) {
			if(user.getVehicle().getPassengerType() != PassengerType.REGULAR)
				users.add(user);
		}
		if(users.isEmpty()) {
			User user1 = carCareCenter.getWaitingList().getUsersWaitingList().get(0);
			for(User user : carCareCenter.getWaitingList().getUsersWaitingList()) {
				if(user.getArrivalTime().compareTo(user1.getArrivalTime()) < 0) {
					user1=user;
				}
			}
			return user1;
		}
		else {
			User user1 = users.get(0);
			for(User user : users) {
				if(user.getArrivalTime().compareTo(user1.getArrivalTime()) < 0) {
					user1=user;
				}
			}
			return user1;
		}
	}
	
}
