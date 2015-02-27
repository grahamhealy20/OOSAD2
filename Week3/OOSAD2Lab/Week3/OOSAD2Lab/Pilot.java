package Week3.OOSAD2Lab;

public class Pilot extends Professional {

	private String license_level;
	private double hours_flown;
	private Rating rating;

	public String getLicense_level() {
		return this.license_level;
	}

	public void setLicense_level(String license_level) {
		this.license_level = license_level;
	}

	public double getHours_flown() {
		return this.hours_flown;
	}

	public void setHours_flown(double hours_flown) {
		this.hours_flown = hours_flown;
	}

	public Pilot(String name, int id, String license_level, double hours_flown) {
		// TODO - implement Pilot.Pilot
		//throw new UnsupportedOperationException();
		super(name, id);
		this.license_level = license_level;
		this.hours_flown = hours_flown;
		System.out.println("\nNew Pilot created");
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("License Level: " + license_level);
		System.out.println("Hours Flown: " + hours_flown);	
	}

	

}
