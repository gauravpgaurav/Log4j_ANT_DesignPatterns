package crea.pattern.singleton;

public class Counter {

	private static Counter count;

	private Counter() {

	}

	// Thread Safe Type
	public synchronized static Counter getInstance() {

		if (count == null)
			count = new Counter();

		return count;

	}
}
