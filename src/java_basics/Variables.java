package java_basics;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		System.out.println("Variables Lecture");
		
		/* 
		 * First of all we need to declare variables.
		 * How to?
		 */
		
		/* 
		 * First variable type and the car name. You don't need to declare a first value.
		 * You can assign a value after declare variable.
		 * Like this:
		 */
 
		int x;
		x = 34;
		System.out.println(x);
		
		/* 
		 * But you can also assign a value when you create a variable.
		 * Like this:
		 */
		
		int y = 50;
		System.out.println(y);
		
		/*
		 * Declaring a string variable.
		 */
		
		String words = "Sentence...!" ;
		System.out.println(words);
		
		/*
		 * You can not put letters on the beginning of a variable declaration but you can put in the end.
		 * Like this:
		 */
		
		String words1234 = "Sntence test...!";
		System.out.println(words1234);
		
		/*
		 * But not like this:
		 * 123words or maybe using special characters like 12@sd. About the special chars not only in beginning
		 * but also in the middle;
		 */
		
		int rere= 134;
		
		/*
		 * As we wait from variables that contain numbers, all math operations can be solved using this variables
		 * also as result of the "print" statement. As you can see below.
		 */
		
		System.out.println(y + 50); // Suppose to return 100
		System.out.println(y * 3); // Suppose to return 150
		System.out.println(y); // Suppose to return 50
		
		/*
		 * But as you can see, y still remaining the data 50, because none of results were storage in some
		 * other variables.
		 */
		
		/*
		 * Strings can also perform a + operation but that means concatenation, that add some string in the end
		 * of other. Let's see.
		 */
		
		System.out.println(words + " For concatenation!"); // Suppose to return 'Sentence...! For concatenation!
		
		/*
		 * None of other simple math operations tested returned a valid sentence ( -, * , /)
		 */
		
		
		
		
	}

}
