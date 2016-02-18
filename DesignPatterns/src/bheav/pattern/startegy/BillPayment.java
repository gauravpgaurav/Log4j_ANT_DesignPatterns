package bheav.pattern.startegy;

public class BillPayment {

	private PaymentStrategy strategy;

	public BillPayment() {
		super();
	}

	public PaymentStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	public String makePayment(double amt, String description) {
		return strategy.pay(amt, description);
	}
}
