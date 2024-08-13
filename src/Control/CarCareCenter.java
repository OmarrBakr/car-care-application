package Control;

import java.util.ArrayList;

import Entity.User;
import Entity.Worker;

public class CarCareCenter {
	private ArrayList<User> users;
	private ArrayList<Worker> workers;
	private WaitingList waitingList;
	private int totalVehicles;
	private double totalIncome;
	
	public CarCareCenter() {
		users = new ArrayList<>();
		workers = new ArrayList<>();
		waitingList = new WaitingList();
	}
	public ArrayList<User> getUsers() {
		return users;
	}
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	public ArrayList<Worker> getWorkers() {
		return workers;
	}
	public void setWorkers(ArrayList<Worker> workers) {
		this.workers = workers;
	}
	public WaitingList getWaitingList() {
		return waitingList;
	}
	public void setWaitingList(WaitingList waitingList) {
		this.waitingList = waitingList;
	}
	public int getTotalVehicles() {
		return totalVehicles;
	}
	public void setTotalVehicles(int totalVehicles) {
		this.totalVehicles = totalVehicles;
	}
	public double getTotalIncome() {
		return totalIncome;
	}
	public void setTotalIncome(double totalIncome) {
		this.totalIncome = totalIncome;
	}
	public User handleWaiting() {
		User user = this.waitingList.handleList(this);
		return user;
	}
}
