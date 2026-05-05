package anotherPackageCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Collections {
	public static void main(String[] args) {

		/*
		 * Arrays Java common
		 */
		String[] arrayWords = { "abacaxi", "maça" };
		System.out.println(Arrays.toString(arrayWords));
		System.out.println(arrayWords);

		/*
		 * Array with ArrayList without type
		 */
		ArrayList words = new ArrayList();

		words.add("teste");
		words.add("abacaxi");
		words.add(1);

		System.out.println(words);

		words.remove("abacaxi");
		System.out.println(words);

		words.remove(1);
		System.out.println(words);

		words.add("Angelo");
		words.add("banana");
		words.add(12.0);

		String item0 = (String) words.get(0);
		Object item1 = words.get(1);

		String itemClass = item1.getClass().getName();
		System.out.println(itemClass);

		/*
		 * Array declaring types
		 */
		// Only complex types can be used in angle brackets. int or similar are not
		// allowed

		// Arraylist <int> intArray = new ArrayList <int>();
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		ArrayList<String> stringArray = new ArrayList<String>();

		intArray.add(120);
		intArray.add(125);

		for (int num : intArray) {
			System.out.println("num");
			System.out.println(num);
		}

		LinkedList<Integer> intlinkedList = new LinkedList<Integer>();

		for (int i = 0; i < 10; i++) {
			intlinkedList.add(i);
		}

		for (int number : intlinkedList) {
			System.out.println(number);
		}

		System.out.println(intlinkedList);

	}
}
