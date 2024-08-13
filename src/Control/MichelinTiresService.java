package Control;

public class MichelinTiresService extends TiresService {
	public MichelinTiresService(Service service) {
		this.service = service;
	}
	
	@Override
	public String getDescription() {
		return (service.getDescription() + ", Michelin " + super.getDescription());
	}
	
	@Override
	public double cost(double area) {
		return (599 + service.cost(area));
	}
}
