package bheav.pattern.startegy;

public class Client {

	public static void main(String[] args) {

		BillPayment bill1 = new BillPayment();
		BillPayment bill2 = new BillPayment();

		CardPayment cardPmt = new CardPayment();
		CashPayment cashPmt = new CashPayment();

		bill1.setStrategy(cardPmt);
		System.out.println(bill1.makePayment(1000, "ICICI12345"));
		System.out.println();
		bill2.setStrategy(cashPmt);
		System.out.println(bill2.makePayment(1000, "101"));

	}

}
