package bheav.pattern.observer;

import java.util.Observable;

public class MealOrder extends Observable {

	private String status;

	public MealOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MealOrder(String status) {
		super();
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		setChanged();
		notifyObservers(status);
	}

}
