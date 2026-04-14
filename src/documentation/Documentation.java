package documentation;

public class Documentation {
	public static void main(String[] args) {
		System.out.println(String.format("Teste de documentation."));
		System.out.println(printSome("Teste"));

	}

	/**
	 * Method name: printSome Function: Print some passed as argument.
	 * 
	 * @param args String - input argument
	 * @return String - return String
	 * 
	 *         Inside the method: Just receive the argument and return a phrase with
	 *         it.
	 */
	public static String printSome(String args) {
		return String.format("Return args: %s.", args);
	}
}