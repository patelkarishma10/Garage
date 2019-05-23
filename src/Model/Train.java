package Model;

public class Train extends Vehicle {
	private int numberOfCarriges;
	private String trainline;

	public Train(String colour, String make, String model, int numberOfCarriges, String trainline) {
		super(colour, make, model);
		this.numberOfCarriges = numberOfCarriges;
		this.trainline = trainline;
	}

	public int getNumberOfCarriges() {
		return numberOfCarriges;
	}

	public void setNumberOfCarriges(int numberOfCarriges) {
		this.numberOfCarriges = numberOfCarriges;
	}

	public void setTrainline(String trainline) {
		this.trainline = trainline;
	}

	public String getTrainline() {
		return trainline;
	}

	@Override
	public String toString() {

		return super.toString() + numberOfCarriges + " " + trainline;
	}

}
