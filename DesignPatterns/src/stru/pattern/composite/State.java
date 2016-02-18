package stru.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class State implements Profitable {

	private String stateName;
	private List<Profitable> cities;

	public State(String stateName) {
		super();
		this.stateName = stateName;
		cities = new ArrayList<>();
	}

	@Override
	public double getProfit() {

		double profit = 0;
		for (Profitable obj : cities) {
			profit += obj.getProfit();
		}

		return profit;
	}

	@Override
	public void addLeaf(Profitable child) {

		if (child instanceof City)
			cities.add(child);
	}

	@Override
	public void removeLeaf(Profitable child) {
		if (child instanceof City)
			cities.remove(child);

	}

}
