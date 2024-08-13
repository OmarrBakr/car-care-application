package Control;

public class BridgestoneTiresService extends TiresService{
	
	public BridgestoneTiresService(Service service) {
		this.service = service;
	}
	
	@Override
	public String getDescription() {
		return (service.getDescription() + ", Bridgestone " + super.getDescription());
	}
	
	@Override
	public double cost(double area) {
		return (499 + service.cost(area));
	}
	
}
