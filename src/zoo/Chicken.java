package zoo;

public class Chicken extends Bird implements Flyable {

	/**
	 * @param age
	 * @param gender
	 * @param weightInLbs
	 */
	public Chicken(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
	}

	@Override
	public void fly() {
		System.out.println("Chickens don't fly..!");
	}

}
