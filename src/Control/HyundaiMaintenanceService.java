package Control;

public class HyundaiMaintenanceService extends OilService{
	
	public HyundaiMaintenanceService(Service service) {
		this.service = service;
	}
	
	@Override
	public String getDescription() {
		return (service.getDescription() + ", Hyundai " + super.getDescription());
	}
	
	@Override
	public double cost(double area) {
		return (1499 + service.cost(area));
	}
	
}
