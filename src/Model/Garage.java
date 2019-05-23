package Model;

import java.util.ArrayList;

public class Garage {

	private int price;

	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public void setVehicleList(ArrayList<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void vehiclePrice(ArrayList<Vehicle> vehicleList) {

		for (Vehicle v : vehicleList) {
			if (v instanceof Boat) {
				price = 30000 + (((Boat) v).getLength() * 100);
				System.out.println(price);
			} else if (v instanceof Car) {
				price = 10000 + (((Car) v).getNumberOfDoor() * 200);
				System.out.println(price);
			} else if (v instanceof Train) {
				price = 10000 + (((Train) v).getNumberOfCarriges() * 1000);
				System.out.println(price);
			}

		}
	}

	public void addVehicleToList(Vehicle a) {
		getVehicleList().add(a);
	}

	public void removeVehicleFromList(Vehicle a) {
		getVehicleList().remove(a);
	}

	public void emptyGarage() {
		getVehicleList().clear();

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// if (vehicleList.stream().filter(p ->
	// p.getClass().getCanonicalName().equals("Model.Boat"))
	// .collect(Collectors.toList()) != null) {
	// System.out.println("boats");
	// // boatPrice = 10000 + (Boat.getLength() * 100);
	// }

}
