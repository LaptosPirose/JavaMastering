package zoo;

public class Sparrow extends Bird implements Flyable {

	/**
	 * @param age
	 * @param gender
	 * @param weightInLbs
	 */
	public Sparrow(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
	}

	@Override
	public void fly() {
		System.out.println("Flying high...");
	}

}
