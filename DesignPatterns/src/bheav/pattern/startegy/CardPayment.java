package bheav.pattern.startegy;

public class CardPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {

		String msg = "Your Payment of INR. " + amt + " By card : " + description + " has been Received";
		StringBuffer buffer = new StringBuffer(msg);

		double processFee = amt * 0.012;

		buffer.append("\nProcessing Fee of Rs. " + processFee + " is Chargeable");
		return buffer.toString();

	}

}
