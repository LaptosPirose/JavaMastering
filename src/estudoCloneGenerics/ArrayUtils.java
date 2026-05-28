package estudoCloneGenerics;

public class ArrayUtils {

	public static <T> T[] reversingArrays(T[] array) {

		T[] reversedArray = array.clone();

		int index = array.length - 1;
		int reversedIndex = 0;

		for (int i = index; i >= 0; i--) {
			reversedArray[reversedIndex] = array[i];
			reversedIndex++;
		}

		return reversedArray;
	}

}
