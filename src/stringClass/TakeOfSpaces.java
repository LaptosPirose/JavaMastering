package stringClass;

public class TakeOfSpaces {
	public static void main(String[] args) {
		String stringTest = "My favorite sound of all life of course is rock and roll";
		System.out.println(stringTest.replaceAll("\\s+", ""));
	
	}
}
