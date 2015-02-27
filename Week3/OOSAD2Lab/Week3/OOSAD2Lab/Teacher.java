package Week3.OOSAD2Lab;

import java.util.*;

public class Teacher extends Professional {

	private String school;
	private String level_of_edu;
	private Collection<Module> modules = new ArrayList<Module>();
	private Collection<Degree> degrees = new ArrayList<Degree>();

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

	public Teacher(String name, int id, String school, String level_of_edu) {
		// TODO - implement Teacher.Teacher
		super(name, id);
		this.school = school;
		this.level_of_edu = level_of_edu;
		System.out.println("New Teacher created");
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("School: " + school);
		System.out.println("Level of Education: " + level_of_edu);		
		// throw new UnsupportedOperationException();
	}

	public void addModule(String name, int classSize) {
		Module m = new Module(name, classSize);	
		modules.add(m);
	}

	public void addDegree(Degree d) {
		degrees.add(d);
	}
}
