package zoo;

public class Fish extends Animal {

	/**
	 * @param age
	 * @param gender
	 * @param weightInLbs
	 */
	public Fish(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
	}

	@Override
	public void move() {
		System.out.println("Fish is swimming..!");
	}

}
