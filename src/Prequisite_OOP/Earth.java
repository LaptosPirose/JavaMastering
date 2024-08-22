package Prequisite_OOP;

/*
 * Shortcut to update all imports Ctrl + Shift + O 
 */

public class Earth {

	public static void main(String[] args) {
		Human john = new Human("John Doyle", 35, 120, "brown");
		john.speak();
		john.eat();
		john.walk();
		john.work();

		System.out.println(john.getName());
		System.out.println(john.getAge());

		System.out.println(john);
		System.out.println(john);

		Human dan = new Human("Daniel Doyle", 36, 122, "brown");
		dan.speak();
		dan.eat();
		dan.walk();
		dan.work();

		System.out.println(dan.getName());
		System.out.println(dan.getAge());

		System.out.println(dan);
		System.out.println(dan);

	}

}
