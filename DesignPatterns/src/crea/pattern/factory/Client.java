package crea.pattern.factory;

public class Client {

	public static void main(String[] args) {

		LoanAccount account = LoanFactory.getInstance();

		System.out.println("Personal Loan EMI :\t" + account.calculateEMI(200000.00, 2));
		System.out.println("Rate Interest \t:\t" + account.getRateOfInterest());
		LoanAccount account2 = LoanFactory.getInstance(LoanType.HOUSINGLOAN);
		System.out.println("\nHousing  Loan EMI :\t" + account2.calculateEMI(50000.00, 2));
		System.out.println("Rate Interest \t:\t" + account2.getRateOfInterest());

	}
}
