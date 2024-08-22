package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		System.out.println("Welcomer to Car Dealership!" );
		
		Customer tom = new Customer("Tom", "123. Anything St.", 12000);
		System.out.println(tom.getName());
		System.out.println(tom.getAddress());
		System.out.println(String.format("$%.2f", tom.getCashOnHand()));
		
		
		Vehicle vehicle = new Vehicle("Honda", "City", 11000);
		Vehicle car = new Vehicle("BMW", "M3", 20000);
		Vehicle car1 = new Vehicle("BMW", "M3", 20000);
		
		
		System.out.println(vehicle.getMake());
		System.out.println(String.format("$%.2f", vehicle.getPrice()));
		System.out.println(vehicle.getModel());
		
		Employee employee = new Employee();
				
		tom.purchaseCar(vehicle,  employee, false);
		
		
		System.out.println(car1.equals(car));
		System.out.println(car.hashCode());
		System.out.println(car1.hashCode());
	}

}
