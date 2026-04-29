package anotherPackageCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LessonOne {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();

		animals.add("Dog");
		animals.add("Cat");
		animals.add("Lion");
//
//		for (int i = 0; i < animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//
//		System.out.println();
//
//		for (String animal : animals) {
//			System.out.println(animal);
//		}

		// Creating array list
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(20);

		// Adding elements
		Vehicle vehicleOne = new Vehicle("Honda", "Acoord", 12.000f);
		vehicles.add(vehicleOne);
		vehicles.add(new Vehicle("Toyota", "Camry", 14.000f));

		// Traversing list
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getMake());
			System.out.println(vehicle.getModel());
			System.out.println(vehicle.getPrice());
			System.out.println();
		}

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		
		System.out.println();
		
		// Creating in LinkedList way
		
		List <Vehicle> anotherVehicles = new LinkedList<Vehicle>();
		vehicleOne = new Vehicle("Honda", "Acoord", 12.000f);
		anotherVehicles.add(vehicleOne);
		anotherVehicles.add(new Vehicle("Toyota", "Camry", 14.000f));
		
		for(Vehicle vehicle : anotherVehicles) {
			System.out.println(vehicle);
		}
		
		printElements(animals);
		printElements(vehicles);
		printElements(anotherVehicles);
	}
	
	public static void printElements(List someList) {
		for(int i =0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	}
}
