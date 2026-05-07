package teste;

import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
		System.out.printf("Exercícios seção 17__!%n");

		// Step 1: Create an ArrayList of Integer type

		int[] arrayInteger = new int[] { 1, 2, 3, 4, 5 };
		addArrayList(arrayInteger);
	}

	public static void addArrayList(int[] input) {
		ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
		for (int elemento : input) {
			arrayListInteger.add(elemento);
		}
		printArrayList(arrayListInteger);
	}

	public static void printArrayList(ArrayList input) {
		String elements = "";

		for (Object i : input) {
			elements = elements.concat(i.toString() + " ");
		}
		System.out.println(elements.length());
		elements.trim();
		System.out.println("Elements: " + elements);
		System.out.println(elements.length());
	}

}
