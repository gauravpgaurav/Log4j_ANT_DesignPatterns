package stru.pattern.proxy;

public class Client {

	public static void print(CalculateBean bean) {

		double cel = bean.farenToCelsius(104);
		System.out.println("Temperature : " + cel);
	}

	public static void main(String[] args) {

		CalculateBeanProxy proxy = new CalculateBeanProxy();
		print(proxy);
	}

}
