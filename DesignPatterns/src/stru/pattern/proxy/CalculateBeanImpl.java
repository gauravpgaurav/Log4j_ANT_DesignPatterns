package stru.pattern.proxy;

public class CalculateBeanImpl implements CalculateBean {

	@Override
	public double farenToCelsius(double faren) {
		return ((faren - 32.0) * (5.0 / 9.0));
	}

}
