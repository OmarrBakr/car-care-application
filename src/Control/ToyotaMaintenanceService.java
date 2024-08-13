package Control;

public class ToyotaMaintenanceService extends OilService{
	
	public ToyotaMaintenanceService(Service service) {
		this.service = service;
	}
	
	@Override
	public String getDescription() {
		return (service.getDescription() + ", Toyota " + super.getDescription());
	}
	
	@Override
	public double cost(double area) {
		return (1999 + service.cost(area));
	}
	
}
