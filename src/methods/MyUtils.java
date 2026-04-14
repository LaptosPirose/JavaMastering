package methods;

class MyUtils {
	/**
	 * 
	 * @param argument
	 */
	public static void printAnotherJunk(int argument) {
		System.out.println("From MyUtils: Integer ==> " + argument);
	}

	/**
	 * 
	 * @param argument
	 */
	public static void printAnotherJunk(String argument) {
		System.out.println("From MyUtils: String ==> " + argument);
	}

	/**
	 * 
	 * @param argument
	 * @return
	 */
	public static String returnJunk(String argument) {
		return ("From MyUtils: return String ==> " + argument);
	}

	/**
	 * 
	 * @param argument
	 * @return
	 */
	public static int returnJunk(int argument) {
		return (argument * 100);
	}

	/**
	 * @param firstArg
	 * @param secondArg
	 * @return
	 */
	public static int sumTwoNumbers(int firstArg, int secondArg) {
		return firstArg + secondArg;
	}

	/**
	 * @param argument
	 * @return
	 */
	private static int privateReturnInteger(int argument) {
		return argument;
	}

	/**
	 * 
	 */
	public static void printPrivateReturnInteger() {
		System.out.println("Value returned by a private method I called: " + privateReturnInteger(1456));
	}

	/**
	 * @param argumentA
	 * @return
	 */
	public int add10(int argumentA) {
		return argumentA + 10;
	}

}
