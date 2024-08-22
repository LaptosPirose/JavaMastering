package car_dealership;

public class Customer {
	private String name;
	private String address;
	private double cashOnHand;
	
	/**
	 * @param name
	 * @param address
	 * @param cashOnHand
	 */
	public Customer(String name, String address, double cashOnHand) {
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		address += "Dealership City";
		this.address = address;
	}

	/**
	 * @return the cashOnHand
	 */
	public double getCashOnHand() {
		cashOnHand += 500;
		return cashOnHand;
	}

	/**
	 * @param cashOnHand the cashOnHand to set
	 */
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
		employee.handleCustomer(this, finance, vehicle);
		
	}

}
