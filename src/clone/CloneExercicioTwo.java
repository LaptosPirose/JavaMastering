package clone;

class PersonTwo implements Cloneable {
	String nameTwo;
	int ageTwo;

	public PersonTwo(String name, int age) {
		this.nameTwo = name;
		this.ageTwo = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void showsInfoTwo() {
		System.out.println("The name is: "+ this.nameTwo +", and age is " + this.ageTwo+".");
	}
}

public class CloneExercicioTwo {
	public static void main(String[] args) {
		PersonTwo aliceTwo = new PersonTwo("Alice", 35);

		try {
			PersonTwo anotherAliceTwo = (PersonTwo) aliceTwo.clone();
			aliceTwo.showsInfoTwo();
			anotherAliceTwo.showsInfoTwo();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		String variavelStringOne = "Angelo";
		int variavelIntTwo = 45;		
		System.out.printf("The name is %s with %d.%n", variavelStringOne, variavelIntTwo);

	}
}