package Control;

public abstract class MaintenanceService extends ServiceDecorator{
	@Override
	public String getDescription() {
		return "Maintenance Service";
	}
}
