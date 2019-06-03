package Model;

public class Car extends Vehicle implements Cloneable {
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
	public Car clone() throws CloneNotSupportedException {
		return (Car) super.clone();
	}

	@Override
	public String toString() {

		return super.toString() + " " + numberOfDoor;
	}
}
