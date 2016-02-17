package stru.pattern.adapter;

/**
 * 
 * @author gpant
 *
 *
 *         Target
 *         
 *         
 */
public class BankAccount {

	private double principle;

	public BankAccount(double principle) {
		super();
		this.principle = 50000.00;
	}

	public double calculate() {
		return principle * .10;
	}
}
