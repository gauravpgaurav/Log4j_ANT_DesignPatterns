package bheav.pattern.startegy;

public class Client {

	public static void main(String[] args) {

		BillPayment bill = new BillPayment();

		CardPayment cardPmt = new CardPayment();
		CashPayment cashPmt = new CashPayment();

		bill.setStrategy(cardPmt);
		System.out.println(bill.makePayment(1000, "ICICI12345"));
		System.out.println();
		bill.setStrategy(cashPmt);
		System.out.println(bill.makePayment(1000, "101"));

	}

}
