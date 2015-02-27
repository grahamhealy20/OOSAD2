package Week3.OOSAD2Lab;

public class Pilot extends Professional {

	private String license_level;
	private double hours_flown;

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

	public Pilot() {
		// TODO - implement Pilot.Pilot
		throw new UnsupportedOperationException();
	}

}