package java_basics;

public class MyUtils {

	/*
	 * Method modifier set to private makes the method only visible and
	 * can be called inside the class
	 */

	/*
	 * The static modifier means that the method can only be accessed when you
	 * call the class not the instance
	 */

	public static void printSomeJunk(String argument) {
		System.out.println(String.format("The argument received is %s. And type of it is: %s.",
				argument, argument.getClass().getName()));
	}

	public static void printSomeJunk(Integer argument) {
		System.out.println(String.format("The argument received is %d. And type of it is %s.",
				argument, argument.getClass()));
	}

	public static int sum2Numbers(int arg1, int arg2) {
		return arg1 + arg2;
	}
}
