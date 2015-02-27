package Week3.OOSAD2Lab;

public class Driver {

	public static void main(String args[]) {

		System.out.println("Test Driver");
		Professional p1 = new Teacher("Graham", 1, "ITTD", "Secondary");
		p1.addModule("Maths", 30);
		Professional p2 = new Pilot("James", 2, "Commercial", 70000000);
		//Professional p3 = new Doctor("Keith", 3, "Commercial", 70000000);
	}

}
