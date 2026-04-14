package zoo;

public abstract class Animal {

	/**
	 * @param age
	 * @param gender
	 * @param weightInLbs
	 */
	int age;
	String gender;
	int weightInLbs;

	public Animal(int age, String gender, int weightInLbs) {
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}

	public void eat() {
		System.out.println("Eating...");
	}

	public void sleep() {
		System.out.println("Sleeping...");
	}
	
	public abstract void move();
}
