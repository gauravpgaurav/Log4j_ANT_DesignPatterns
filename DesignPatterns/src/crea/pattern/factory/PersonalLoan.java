package crea.pattern.factory;

import java.util.logging.Logger;

/**
 * 
 * @author gpant
 *
 *         Sub Class 2 / Product 2
 *
 */
public class PersonalLoan extends LoanAccount {

	private double processingFees = 2000.0;
	Logger log = Logger.getLogger(this.getClass().getName());

	protected PersonalLoan(double rateOfInterest) {

		super(rateOfInterest);
		log.info("Personal Loan Initiated");
	}

	@Override
	public double calculateEMI(double loanAmount, double tenure) {

		log.info("Personal Loan EMI Called");
		return (loanAmount * getRateOfInterest() * tenure) + processingFees;
	}

}
