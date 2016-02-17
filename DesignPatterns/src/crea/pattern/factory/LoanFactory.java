package crea.pattern.factory;

/**
 * 
 * @author gpant
 * 
 *         Factory Class with a Static Method to create Instance of Subclass
 *
 */
public class LoanFactory {

	public static LoanAccount getInstance() {
		return getLoanAccount(LoanType.PERSONALLOAN);
	}

	public static LoanAccount getInstance(LoanType type) {
		return getLoanAccount(type);
		
	}

	private static LoanAccount getLoanAccount(LoanType type) {
		LoanAccount account = null;
		switch (type) {

		case PERSONALLOAN:
			account = new PersonalLoan(12.00);
			break;

		case HOUSINGLOAN:
			account = new HousingLoan(13.00);
			break;

		default:
			account = null;
		}
		return account;
	}
}
