package javaleads.lesson2;

public abstract class Vehicle {
	private String type;
	private int capacity;
	
	public void printVehicalDetails() {
		System.out.printf("The details of the vehicle: \nType: %s, Capacity: %d", type, capacity);
	}
	
	public abstract void runVehicle();
}
