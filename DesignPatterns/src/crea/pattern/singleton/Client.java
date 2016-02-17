package crea.pattern.singleton;

public class Client {

	public static void main(String[] args) {

		Counter count1 = Counter.getInstance();

		System.out.println("Counter 1 :\t"+count1.hashCode());
		
		Counter count2 = Counter.getInstance();
		
		System.out.println("Counter 2 :\t"+count2.hashCode());

		Counter count3 = Counter.getInstance();
		
		System.out.println("Counter 3 :\t"+count3.hashCode());

	}

}
