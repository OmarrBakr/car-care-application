package Control;

public class ShellOilService extends OilService{
	
	public ShellOilService(Service service) {
		this.service = service;
	}
	
	@Override
	public String getDescription() {
		return (service.getDescription() + ", Shell " + super.getDescription());
	}
	
	@Override
	public double cost(double area) {
		return (49 + service.cost(area));
	}
	
}
