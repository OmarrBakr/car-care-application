package Control;

public class CleanInService extends Service{

	@Override
	public String getDescription() {
		return "Clean-in Service";
	}

	@Override
	public double cost(double area) {
		return 25*area;
	}
	

}
