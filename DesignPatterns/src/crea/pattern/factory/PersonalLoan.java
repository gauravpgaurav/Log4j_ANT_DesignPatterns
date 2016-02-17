package crea.pattern.factory;

/**
 * 
 * @author gpant
 *
 *         Sub Class 2 / Product 2
 *
 */
public class PersonalLoan extends LoanAccount {

	private double processingFees;

	protected PersonalLoan(double rateOfInterest) {
		super(rateOfInterest);
		
	}

	@Override
	public double calculateEMI(double loanAmount, double tenure) {

		return (loanAmount * getRateOfInterest() * tenure) + processingFees;
	}

}
