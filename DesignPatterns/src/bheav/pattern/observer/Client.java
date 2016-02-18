package bheav.pattern.observer;

public class Client {

	public static void main(String[] args) {

		MealOrder order = new MealOrder();
		Waiter waiter = new Waiter();

		order.addObserver(waiter);

		order.setStatus("Accepted");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}
		order.setStatus("Completed");
	}

}
