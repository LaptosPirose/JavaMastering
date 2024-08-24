package traversinglists_customtypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import collections.Vehicle;

public class Application {

	public static void main(String[] args) {

		List<String> animals = new ArrayList<String>();

		animals.add("Lion");
		animals.add("Bird");
		animals.add("Dog");
		animals.add("Snake");

//		for(int i = 0; i< animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}

//		for (String animal : animals) {
//			System.out.println(animal);
//		}

		List<Vehicle> vehicles = new LinkedList<Vehicle>();
		Vehicle car = new Vehicle("Honda", "Accord", 15000, false);
		
		vehicles.add(car);
		vehicles.add(new Vehicle("Toyota", "Corolla", 20000, true));
		vehicles.add(new Vehicle("Jeep", "Compass", 18000, true));
		
		printElements(vehicles);
		printElements(animals);
		

	}
	
	private static void printElements(List list) {
		for (int index =0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
	}

}
