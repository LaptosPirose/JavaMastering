package java_basics;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		/*
		 * Mounting phrase with String.format method.
		 */
		
		long minimumValueLong = -9223372036854775808L;
		System.out.println("Minimum number accpeted by a long number: " + minimumValueLong + ".");
		long maximumValueLong = 9223372036854775807L;
		System.out.println("Maximum number accpeted by a long number: " + maximumValueLong  + ".");
		
		System.out.println(String.format("Minimum number accpeted by a long number:  %d. And "
				+ "maximum number accpeted by a long number: %d.", minimumValueLong, maximumValueLong));
	}

}
