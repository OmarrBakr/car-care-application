package Control;

public abstract class OilService extends ServiceDecorator{
	@Override
	public String getDescription() {
		return "Oil Change Service";
	}
}
