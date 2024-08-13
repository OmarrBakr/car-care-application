package Control;

import Entity.User;

public class FirstComeFirstServedStrategy implements WaitingListStrategy{

	@Override
	public User execute(CarCareCenter carCareCenter) {
		User user1 = carCareCenter.getWaitingList().getUsersWaitingList().get(0);
		for(User user : carCareCenter.getWaitingList().getUsersWaitingList()) {
			if(user.getArrivalTime().compareTo(user1.getArrivalTime()) < 0) {
				user1=user;
			}
		}
		return user1;
	}

}
