package methods;

public class Methods {
	public static void main(String[] args) {
		System.out.println("Hello Methods__!");
		printSomeJunk("34");
		printSomeJunk(34);

		MyUtils.printAnotherJunk("25");
		MyUtils.printAnotherJunk(25);

		System.out.println("Sum of these two numbers is: " + MyUtils.sumTwoNumbers(240, 130));

		System.out.println(MyUtils.returnJunk("Some text"));
		System.out.println("FromMyUtils: return Integer ==> " + MyUtils.returnJunk(134));

		MyUtils.printPrivateReturnInteger();

		// Create a class instance
		MyUtils MyUtilsInstance = new MyUtils();

		System.out.println("Value from add10 public method ==> " + MyUtilsInstance.add10(200));
		// The add10 method does not appear in class calling but only in instance
		// calling
		// The add10 method can no longer be called by class

	}

	public static void printSomeJunk(int argument) {
		System.out.println("Inside the Clas: Integer ==> " + argument);
	}

	public static void printSomeJunk(String argument) {
		System.out.println("Inside the Class: String ==> " + argument);
	}
}
