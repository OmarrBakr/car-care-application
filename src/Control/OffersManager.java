package Control;

import Entity.Offer;

import java.util.ArrayList;

public class OffersManager {
    private ArrayList<Offer> availableOffers;
    public OffersManager() {
        availableOffers = new ArrayList<>();
    }
	public void setAvailableOffers(ArrayList<Offer> availableOffers) {
		this.availableOffers = availableOffers;
	}
	public ArrayList<Offer> getAvailableOffers() {
		return availableOffers;
	}
}
