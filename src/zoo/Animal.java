package zoo;

public abstract class Animal {

	int age;
	String gender;
	int weightInLbs;
	

	public Animal(int age, String gender, int weightInLbs) {
		/*
		 * Constructor method to Animal class
		 */
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void sleep() {
		System.out.println("sleeping...");
	}
	
	/*
	 * This is an abstract method inside abstract class that means you must implement this method
	 * when you create a child class.
	 * You cannot create an instance for abstract class, this will be only for mother of someone other class 
	 */
	public abstract void move();

}
