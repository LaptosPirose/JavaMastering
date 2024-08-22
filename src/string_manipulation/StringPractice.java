package string_manipulation;

public class StringPractice {

	public static void main(String[] args) {
		System.out.println("Practicing with Strings!");
		
		String word = "   Hello World!  ";
		
		/*
		 * String variable length 
		 */
		// System.out.println(String.format("The '%s' variable length  is %d!", word, word.length()));
		
		
		/*
		 * String index of a char
		 */
		// System.out.println(word.indexOf('H'));
		/*
		 * You can specify the start of searching text and text to search
		 */
		// System.out.println(word.indexOf("Wor", 4)); 
		
		/*
		 * The searching is from left to right
		 */
		
		/*
		* Looking for string Wor since the 4th position
		* Return the position where text is
		*/
		
		/*
		 * Searching from right to left
		 * Both always show the first occurrence of text
		 */
		System.out.println(word.lastIndexOf("Hello", 5)); // From right to left searching Hello since 5th pos
	
		
		/*
		 * String char in a specified index
		 */
		System.out.println(word.charAt(3));
		
		
		/*
		 * Cutting a part of String - a substring
		 */
		System.out.println(word.substring(4));
		/* 
		 * You can also pass two arguments in order to define the start point of cut and
		 * the end point of cut
		 */
		System.out.println(word.substring(4,8));
		
		
		/*
		 * Take off spaces leading and trailing the string
		 */
		System.out.println(word.strip());
		
		
		/*
		 * Take off all spaces in String
		 */
		System.out.println(word.replaceAll(" ", ""));
		
		/*
		 * Comparing Strings
		 */
		
//		String a = "hello";
//		String b = "there";
//		
//		if (a == "hello") {
//			System.out.println("a is equal to hello");
//		} // Don´t use this. It's a trap
//			
//		if (a.equals("hello")) {
//			System.out.println("a is equal to hello");
//		}
//		
//		if (b.equalsIgnoreCase("There")) {
//			System.out.println("b is equal to there");
//		}
//		
//		System.out.println();
		
	}

}
