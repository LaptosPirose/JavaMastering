package methods;

class MyUtils {
	public static void printAnotherJunk(int argument) {
		System.out.println("From MyUtils: Integer ==> " + argument);
	}

	public static void printAnotherJunk(String argument) {
		System.out.println("From MyUtils: String ==> " + argument);
	}

	public static String returnJunk(String argument) {
		return ("From MyUtils: return String ==> " + argument);
	}

	public static int returnJunk(int argument) {
		return (argument * 100);
	}

	public static int sumTwoNumbers(int firstArg, int secondArg) {
		return firstArg + secondArg;
	}

	private static int privateReturnInteger(int argument) {
		return argument;
	}

	public static void printPrivateReturnInteger() {
		System.out.println("Value returned by a private method I called: " + privateReturnInteger(1456));
	}

	public int add10(int argumentA) {
		return argumentA + 10;
	}

}
