package Week3.OOSAD2Lab;

import java.util.*;

public class Doctor extends Professional {

	private String practice;
	private boolean is_registered;
	private Collection<Specialisation> specialisations;

	public String getPractice() {
		return this.practice;
	}

	public void setPractice(String practice) {
		this.practice = practice;
	}

	public boolean getIs_registered() {
		return this.is_registered;
	}

	public void setIs_registered(boolean is_registered) {
		this.is_registered = is_registered;
	}

	public Doctor() {
		// TODO - implement Doctor.Doctor
		throw new UnsupportedOperationException();
	}

}