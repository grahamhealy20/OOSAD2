package Week3.OOSAD2Lab;

public class Module {

	private String name;
	private int classSize;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassSize() {
		return this.classSize;
	}

	public void setClassSize(int classSize) {
		this.classSize = classSize;
	}

	public Module() {
		// TODO - implement Module.Module
		throw new UnsupportedOperationException();
	}

	public Module(String name, int classSize) {
		this.name = name;
		this.classSize = classSize;
		System.out.println("New Module Created");
		System.out.println("Name: " + name);
		System.out.println("Class Size: " + classSize);
		}

}
