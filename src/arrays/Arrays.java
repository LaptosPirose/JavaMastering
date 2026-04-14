package arrays;

public class Arrays {

	public static void main(String[] args) {

		int[] arrayInt = new int[100];
		System.out.println(arrayInt);

		int i = 0;

		for (i = 0; i < 100; i++) {
			System.out.println(i);
		}

		int[] anotherIntArray = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println(anotherIntArray[2]);

		String[] stringArray = new String[] { "My", "name", "is" };
		System.out.println(stringArray[0]);

	}

}
