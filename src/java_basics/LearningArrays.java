package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		System.out.println("Learning Arrays");
		
		/* 
		 * We are creating an array with 3 integer elements.
		 */
      //int value[] = {100, 200, 300}; or
		int value[] = new int[]{100, 200, 300};
		System.out.println(value.length);
		
		/*
		 * Traveling trough all array elements
		 */
		for (int i = 0; i < value.length; i++) {
			  System.out.println(value[i]);
		}
		
		/*
		 * But if we are looking for just declaring variable with an specific number of slots we need to do this.
		 */
		
		String [] words= new String[3];
		words[0] = "My";
		words[1] = "name";
		words[2] = "is";
		System.out.println(words[2]); // Print the last item in array
		System.out.println(words[words.length-1]); // Also print the last, independent if
		//we know the size of array
		
		/*
		 * We cannot increase or reduce the array size but create a new one based on the array created before.
		 * In this case the data are lost.
		 */
		
		words = new String[10];
		System.out.println(words[0]); // The data was lost;
		
		
		
		

		
		
		
		
		
	}

}
