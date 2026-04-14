package control_flow;

public class IfElse {
	public static void main(String[] args) {
		// TODO include code here___!

		boolean hungry = false;

		if (hungry) {
			System.out.println("I'm starving__!");
		} else {
			System.out.println("I'm not hungry__!");
		}

		// Using not operator
		if (!hungry) {
			System.out.println("I'm not hungry__!");
		} else {
			System.out.println("I'm starving__!");
		}

		// Comparison statements inside parenthesis, available as true or false
		if (2 == 2) {
			System.out.println("Two is equal to two__!");
		} else {
			System.out.println(("Two is not equal to two__!"));
		}

		// Quantity statements
		int hungerRating = 5;
		if (hungerRating < 6) {
			System.out.println("I'm not hungry__!");
		} else {
			System.out.println("I'm starving__!");
		}

		if (!(hungerRating < 6)) {
			System.out.println("I'm starving__!");
		} else {
			System.out.println("I'm not hungry__!");
		}

		// Control flow with if else statements also include "else if" statement

	}
}
