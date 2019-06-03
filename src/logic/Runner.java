package logic;

import Model.Boat;
import Model.Car;
import Model.Garage;
import Model.Train;

public class Runner {

	public static void main(String[] args) {

		Boat rowboat = new Boat("red", "some make", "a model", " myBoat", "row boat", 3);
		Boat yacht = new Boat("white", "some make", "a model", " aBoat", "yacht", 50);
		Car smallCar = new Car("blue", "kia", "rio", 5);
		Train southernTrain = new Train("green", "bullet", "po009", 8, "southern rail");
		Garage vl1 = new Garage();
		System.out.println(rowboat);
		Boat rowboat2 = null;
		try {
			rowboat2 = rowboat.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vl1.addVehicleToList(rowboat2);
		vl1.addVehicleToList(rowboat);
		vl1.addVehicleToList(smallCar);
		vl1.addVehicleToList(southernTrain);
		vl1.addVehicleToList(yacht);
		// vl1.removeVehicleFromList(rowboat);
		System.out.println(vl1.getVehicleList());
		vl1.vehiclePrice(vl1.getVehicleList());
		// vl1.emptyGarage();
		// System.out.println(vl1.getVehicleList());
	}

}
