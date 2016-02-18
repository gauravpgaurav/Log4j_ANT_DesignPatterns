package bheav.pattern.startegy;

public class CashPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {

		double discount = amt * 0.05;

		String msg = "Your Payment of INR. " + (amt - discount) + " Receipt Number : " + description
				+ " has been Received";
		StringBuffer buffer = new StringBuffer(msg);

		buffer.append("\nDiscount of Rs. " + discount + " has been Given");
		return buffer.toString();

	}

}
