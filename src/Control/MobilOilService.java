package Control;

public class MobilOilService extends OilService{
	
	public MobilOilService(Service service) {
		this.service = service;
	}
	
	@Override
	public String getDescription() {
		return (service.getDescription() + ", Mobil " + super.getDescription());
	}
	
	@Override
	public double cost(double area) {
		return (55 + service.cost(area));
	}
	
}
