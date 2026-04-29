package randomic;

import java.util.Arrays;
import java.util.Random;

public class CreateRandom {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arrayInt = new int[15];

		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = random.nextInt(1, 30);
			System.out.println(random.nextInt(1, 30));
		}
		
		System.out.println(Arrays.toString(arrayInt));

	}
}
