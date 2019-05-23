package Model;

public class Car extends Vehicle {
	private int numberOfDoor;

	public Car(String colour, String make, String model, int numberOfDoor) {
		super(colour, make, model);
		this.numberOfDoor = numberOfDoor;

	}

	public int getNumberOfDoor() {
		return numberOfDoor;
	}

	public void setNumberOfDoor(int numberOfDoor) {
		this.numberOfDoor = numberOfDoor;
	}

	@Override
	public String toString() {

		return super.toString() + " " + numberOfDoor;
	}
}
