package Week3.OOSAD2Lab;

public class Professional {

	private String name;
	private int id;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Professional(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Professional() {
		// TODO - implement Professional.Professional
		throw new UnsupportedOperationException();
	}

}
