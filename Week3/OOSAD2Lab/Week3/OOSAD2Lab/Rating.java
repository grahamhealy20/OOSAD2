package Week3.OOSAD2Lab;

public class Rating extends Qualification {

	private String rank;
	private int no_of_emergencies;

	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getNo_of_emergencies() {
		return this.no_of_emergencies;
	}

	public void setNo_of_emergencies(int no_of_emergencies) {
		this.no_of_emergencies = no_of_emergencies;
	}

	public Rating() {
		// TODO - implement Rating.Rating
		throw new UnsupportedOperationException();
	}

}