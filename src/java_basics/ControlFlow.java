package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		System.out.println("Learning Control Flow");
		
		boolean hungry = true;
		
		if (!hungry){
			System.out.println("I'm Ok!");
		}else {
			System.out.println("I'm Starving...");
				
		}
		
		String opinion; 
		/* 
		 * If you don't initialize a variable it can show an error
		 * Because the if statement can never be executed and never assign a value for it.
		 * So, you must create a if condition that is always executed in order to clear this error or initialize
		 * variable
		 */
		int temperature = 20;
		
		if (temperature != 0){
			if (temperature < 50) {
				opinion = "Is COLD!";
			} else {
				opinion = "Is not Cold!";
			}
		}else {
			opinion = null;
		}
		
		System.out.println(opinion);
		
		/*
		 * Switch statement
		 */
		
		char[] charArray = new char[10];
//		System.out.println(charArray.length);
		
		for (int i=0; i<charArray.length; i++ ) {
			charArray[i] = (char)(i+65);
//			System.out.println(i);
//			System.out.println(charArray[i]);
		}
		
		System.out.println(charArray);
		
		int arrayLength = 0;
		
		switch(charArray.length) {
			case 1:arrayLength = 1;
				break;
			
			case 2: arrayLength = 2;
				break;
	
			case 10: arrayLength = 10;
				break;
	
			default: arrayLength = 0;
				break;
		}
		
		System.out.println(String.format("The Array of char has %d elements.", arrayLength));
		
	}
}
