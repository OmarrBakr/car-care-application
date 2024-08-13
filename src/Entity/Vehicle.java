package Entity;

import Enum.PassengerType;

public class Vehicle {
	private static int UIDCounter = 0;
	private String modelName;
	private int UID;
	private double length;
	private double width;
	private String modelYear;
	private PassengerType passengerType;
	public Vehicle(String modelName, double length, double width, String modelYear, PassengerType passengerType){
		this.modelName = modelName;
		this.length = length;
		this.width = width;
		this.modelYear = modelYear;
		this.passengerType = passengerType;
		UIDCounter++;
		this.UID = UIDCounter;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getUID() {
		return UID;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	public PassengerType getPassengerType() {
		return passengerType;
	}
	public void setPassengerType(PassengerType passengerType) {
		this.passengerType = passengerType;
	}
	
}
