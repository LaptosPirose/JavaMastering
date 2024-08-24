package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {

		/*
		 * Sets prevent to not duplicate values inside the collection. The items can be
		 * shown out of order.
		 */
		HashSet<Integer> values = new HashSet<Integer>();
		values.add(1000);
		values.add(1300);
		values.add(120);
		values.add(1000);
		values.add(120);
		values.add(1250);
		values.add(1300);
		for (int value : values) {
			System.out.println(value);
		}

		/*
		 * LinkedHash prevents duplicate values and keep the order
		 */
		LinkedHashSet<String> words = new LinkedHashSet<String>();
		words.add("People");
		words.add("Test");
		words.add("Dog");
		words.add("People");
		words.add("Cat");
		
		for(String word : words) {
			System.out.println(word);
		}
	}

}
