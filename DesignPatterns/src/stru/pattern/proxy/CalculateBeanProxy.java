package stru.pattern.proxy;

public class CalculateBeanProxy implements CalculateBean {

	private CalculateBeanImpl real;

	@Override
	public double farenToCelsius(double faren) {

		real = new CalculateBeanImpl();
		return real.farenToCelsius(faren);
		
	}
}
