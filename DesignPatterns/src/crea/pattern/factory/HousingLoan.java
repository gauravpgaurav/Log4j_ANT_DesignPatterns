package crea.pattern.factory;

/**
 * 
 * @author gpant
 *
 *         Sub Class 1 / Product 1
 *
 */
public class HousingLoan extends LoanAccount {

	protected HousingLoan(double rateOfInterest) {
		super(rateOfInterest);
		
	}

	@Override
	public double calculateEMI(double loanAmount, double tenure) {

		return (loanAmount * getRateOfInterest() * tenure);

	}

}
