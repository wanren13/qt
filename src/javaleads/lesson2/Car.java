package javaleads.lesson2;

public class Car extends Vehicle {
	int engineCount;
	public void printVehicleDetails() {
		super.printVehicalDetails();
		System.out.println("EngineCount: " + engineCount);
	}
	public void runVehicle() {
		System.out.println("Run");
	}
}
