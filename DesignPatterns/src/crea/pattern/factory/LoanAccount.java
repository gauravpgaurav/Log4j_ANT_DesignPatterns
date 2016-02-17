package crea.pattern.factory;

import java.util.logging.Logger;

/**
 * 
 * @author gpant
 *
 *         Super Type / Super Class
 *
 */
public abstract class LoanAccount {

	private double rateOfInterest;

	protected LoanAccount(double rateOfInterest) {

		this.rateOfInterest = rateOfInterest;
		Logger log = Logger.getLogger(this.getClass().getName());
		log.info("Super Class Initiated");
		
	}

	public abstract double calculateEMI(double loanAmount, double tenure);

	public double getRateOfInterest() {
		return rateOfInterest;
	}

}
