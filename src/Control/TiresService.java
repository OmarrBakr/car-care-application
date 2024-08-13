package Control;

public abstract class TiresService extends ServiceDecorator{
	@Override
	public String getDescription() {
		return "Tires Change Service";
	}
}
