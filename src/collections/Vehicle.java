package collections;

public class Vehicle {
	private String make;
	private String model;
	private double price;
	private boolean forRealDrive;
	/**
	 * @param make
	 * @param model
	 * @param price
	 * @param forRealDrive
	 */
	public Vehicle(String make, String model, double price, boolean forRealDrive) {
		this.make = make;
		this.model = model;
		this.price = price;
		this.forRealDrive = forRealDrive;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the forRealDrive
	 */
	public boolean isForRealDrive() {
		return forRealDrive;
	}
	/**
	 * @param forRealDrive the forRealDrive to set
	 */
	public void setForRealDrive(boolean forRealDrive) {
		this.forRealDrive = forRealDrive;
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", forRealDrive=" + forRealDrive
				+ "]";
	}
	
	

}
