package stringClass;

public class StringsPractice {
	public static void main(String[] args) {
		String a = "hello";
		/**
		 * Char in a string position
		 */
		System.out.println(a.charAt(2));
				
		/**
		 * String length 
		 */
		System.out.println(a.length());
		
		a = "hello       ";
		System.out.println(a.length());
		
		/**
		 * Substring method
		 * @param is the index for starting String read
		 */
		a = "Angelo Moura";
		String substring = a.substring(3);
		System.out.println(substring);
		
		/**
		 * With begin parameter and end parameter
		 * @param - first is the begin parameter - included
		 * @param - second is the end parameter - not included 
		 */
		substring = a.substring(2,5);
		System.out.println(substring);
		//  #gel
		
		/**
		 * Comparing Strings
		 *  ** Don't use this String a == "something"
		 *  Use the .equals method - and this is a case sensitive method
		 */
		System.out.println(a.equals("Angelo Moura"));
		// #true
		
		/**
		 * Using equals to ignore the case, use .equalsIgnoreCase
		 * even if one is "Angelo Moura" and the other one is "angelo moura"
		 * the result will be true
		 */
		System.out.println(a.equalsIgnoreCase("angelo moura"));
		// #true
		
		/**
		 * IndexOf method returns the index when you pass the letter as parameter
		 */
		System.out.println(a.indexOf('o'));
		// #5
		
		System.out.println(a.indexOf("Moura"));
		// #7
		
		/**
		 * If you must specify since where the method must search, use the method with
		 * two parameters
		 */
		System.out.println(a.indexOf("ra", 5)); // Search "ra" from the 5 position
		/** #10
		*found "ra" in the position 10
		*remember the method will return the first index for the string, searching from the 
		*left to right
		*/
		
		/**
		 * If you must search from the right to left, returning 
		 * the first index occurring, use the the lastIndexOf method
		 */
		System.out.println(a);
		System.out.println(a.indexOf("lo"));
		System.out.println(a.lastIndexOf("lo"));
		// #4
		// both returns 4
		
		String phrase = "help me again with a  Java help.";
		System.out.println(phrase.indexOf("help")); // #0
		System.out.println(phrase.lastIndexOf("help")); // #27
	}
}
