package Entity;

import java.util.ArrayList;

import Control.Service;

public class Offer {
	private String name;
    private ArrayList<Service> services;
    private double discountedPrice;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Service> getServices() {
		return services;
	}
	public void setServices(ArrayList<Service> services) {
		this.services = services;
	}
	public double getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
    
}
