package Model;

public class Boat extends Vehicle implements Cloneable {
	private String name;
	private String type;
	private int length;

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Boat(String colour, String make, String model, String name, String type, int length) {
		super(colour, make, model);
		this.name = name;
		this.type = type;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getLength() {
		return length;
	}

	@Override
	public Boat clone() throws CloneNotSupportedException {
		return (Boat) super.clone();
	}

	@Override
	public String toString() {
		return super.toString() + " " + name + " " + type + " " + length;

	}

}
