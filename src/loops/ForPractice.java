package loops;

public class ForPractice {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println("i: " + i);
		}

		String stringTest = "My favorite sound of all life of course is rock and roll";
		for (int i = 0; i < stringTest.length(); i++) {
			System.out.println("char " + i + " is : " + stringTest.charAt(i) + ".");
		}

		for (int i = 0; i < 30; i++) {
			System.out.println(i);
		}
	}
}
