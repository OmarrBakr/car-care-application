package Control;

import java.util.ArrayList;

import Entity.User;

public class WaitingList {
	private WaitingListStrategy listStrategy = new FirstComeFirstServedStrategy();
	private ArrayList<User> usersWaitingList;
	public WaitingList() {
		usersWaitingList = new ArrayList<>();
	}
	public WaitingListStrategy getListStrategy() {
		return listStrategy;
	}
	public void setListStrategy(WaitingListStrategy listStrategy) {
		this.listStrategy = listStrategy;
	}
	public ArrayList<User> getUsersWaitingList() {
		return usersWaitingList;
	}
	public void setUsersWaitingList(ArrayList<User> usersWaitingList) {
		this.usersWaitingList = usersWaitingList;
	}
	public User handleList(CarCareCenter carCareCenter) {
		User user = listStrategy.execute(carCareCenter);
		return user;
	}
}
