package javaleads.lesson1;

public class Vehicle {
	private String type;
	private int capacity;
	
	public void printVehicalDetails() {
		System.out.printf("The details of the vehicle: \nType: %s, Capacity: %d", type, capacity);
	}
	
	public void runVehicle() {
		System.out.println("Run");
	}
}
