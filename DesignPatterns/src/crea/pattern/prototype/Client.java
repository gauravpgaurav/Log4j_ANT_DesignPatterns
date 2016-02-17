package crea.pattern.prototype;

public class Client {

	public static void main(String[] args) {

		Employee orginal = new Employee(101, "Rajesh");
		System.out.println("Initial : \t" + orginal);
		Employee prototype = null;

		try {

			prototype = (Employee) orginal.clone();
			prototype.setEmployeeName("Mr. " + prototype.getEmployeeName());

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		System.out.println("Original : \t" + orginal);
		System.out.println("Prototype : \t" + prototype);
	}

}
