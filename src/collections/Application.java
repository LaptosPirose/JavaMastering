package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {

//		ArrayList words = new ArrayList();
//		words.add("a");
//		words.add("b");
//		words.add("c");
//		words.add("d");
//		words.add(1);
//		words.add(15);
//		words.add("H");
//		words.add("120");
//		
//		System.out.println(words.getClass());
//		System.out.println(words.get(3));
//		
//		String item1 =  (String)words.get(0); // Casting content to String
//		/*
//		 * Actually arraylist items are objects
//		 * So...
//		 */
//		
//		Object item2 = words.get(3);
//		System.out.println(item2.getClass());

		/*
		 * Forcing a rule to Array List
		 */

		ArrayList<String> words = new ArrayList();
		/*
		 * <???>Parameterization. Only complex data types. No int, but Integer
		 * (associated with a class)
		 */
		
		/*
		 * The standard length of an arraylist is 10. If you put 11, it will create more 10 slots.
		 * Always when you exceed the numbers of slots, arraylist will duplicate number of slots, from
		 * 20 to 40 and so on.
		 * 
		 * Arraylist is fast for retrieve data but not to manipulate;
		 * LinkedList is fast to manipulate and lazy to retrieve data.
		 */
		words.add("a");
		words.add("b");
		words.add("c");
		words.add("d");
		words.add("1");
		words.add("15");
		words.add("H");
		words.add("120");
		
		System.out.println(words);

		/*
		 * Linked Lists
		 */

		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(201);
		numbers.add(202);
		numbers.add(203);
		
		for(int number:numbers) {
			/*
			 * For each number in numbers
			 */
			System.out.println(number);
		}

	}

}
