package Entity;

import java.time.LocalDateTime;

import Control.Service;
import Enum.PaymentMethod;

public class User {
	private Vehicle vehicle;
	private Service	service;
	private LocalDateTime arrivalTime;
	private Boolean finished = false;
	private PaymentMethod paymentMethod;
	public User(Vehicle vehicle) {
		this.vehicle = vehicle;
		this.arrivalTime = LocalDateTime.now();
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Boolean getFinished() {
		return finished;
	}
	public void setFinished(Boolean finished) {
		this.finished = finished;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
