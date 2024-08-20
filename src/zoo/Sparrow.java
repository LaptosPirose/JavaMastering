package zoo;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}

	/*
	 * A class can have just one mother class but various Interfaces
	 */
	
	@Override
	public void fly() {
		System.out.println("Sparrows flying high...");
	}
}
