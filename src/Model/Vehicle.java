package Model;

public abstract class Vehicle {
	private String colour;
	private String make;
	private String model;

	public Vehicle(String colour, String make, String model) {
		this.colour = colour;
		this.make = make;
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return " " + colour + " " + make + " " + model;
	}

}
