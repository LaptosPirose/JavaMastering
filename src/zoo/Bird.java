package zoo;

public class Bird extends Animal {

	/**
	 * @param age
	 * @param gender
	 * @param weightInLbs
	 */
	public Bird(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
	}

	@Override
	public void move() {
		System.out.println("Flapping wings...");
	}

}
