package crea.pattern.factory;

import java.util.logging.Logger;

/**
 * 
 * @author gpant
 *
 *         Sub Class 1 / Product 1
 *
 */
public class HousingLoan extends LoanAccount {

	Logger log = Logger.getLogger(this.getClass().getName());

	protected HousingLoan(double rateOfInterest) {
		super(rateOfInterest);
		log.info("Housing Loan Initiated");

	}

	@Override
	public double calculateEMI(double loanAmount, double tenure) {

		log.info("Personal Loan EMI Called");
		return (loanAmount * getRateOfInterest() * tenure);

	}

}
