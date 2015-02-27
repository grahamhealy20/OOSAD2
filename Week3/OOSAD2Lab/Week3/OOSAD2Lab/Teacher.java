package Week3.OOSAD2Lab;

import java.util.*;

public class Teacher extends Professional {

	private String school;
	private String level_of_edu;
	private Collection<Module> modules;

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getLevel_of_edu() {
		return this.level_of_edu;
	}

	public void setLevel_of_edu(String level_of_edu) {
		this.level_of_edu = level_of_edu;
	}

	public Teacher() {
		// TODO - implement Teacher.Teacher
		throw new UnsupportedOperationException();
	}

}