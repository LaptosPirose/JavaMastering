package genericsEstudoTwo;

public class ArrayUtils {
    public static <T> T[] reverseArray(T[] array) {
        T[] reversedArray = array.clone();
        
        for (int i = 0; i < reversedArray.length; i++) {
        	System.out.println(reversedArray[i]);
        }
        int n = reversedArray.length;
        for (int i = 0; i < n / 2; i++) {
            T temp = reversedArray[i];
            reversedArray[i] = reversedArray[n - 1 - i];
            reversedArray[n - 1 - i] = temp;
        }
        return reversedArray;
    }
 
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
