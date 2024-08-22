package car_dealership;

public class Employee {
	
	
	public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
		if (finance) {
			double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
			runCreditHistory(customer, loanAmount);
		}else if (vehicle.getPrice() <= customer.getCashOnHand()) {
			processTransaction(customer, vehicle);
		}else {
			System.out.println("Cutomer will need more money for that...");
		}
	}
	
	public void runCreditHistory(Customer customer, double loanAmount) {
		System.out.println("Ran credit history for Customer...");
		System.out.println("Customer has been approved to purchase the vehicle.");
	}
	
	public void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println(String.format("Customer has purchased the vehicle: "
				+ "%s for the price $%.2f", vehicle, vehicle.getPrice()));
	}

}
