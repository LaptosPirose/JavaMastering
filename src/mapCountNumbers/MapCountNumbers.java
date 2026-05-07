package mapCountNumbers;

import java.util.HashMap;
import java.util.Map;

/**
 * Quantos números aparecem somente uma vez.
 */
class Exercise {
	public int countUnique(int[] A) {
		Map<Integer, Integer> frequency = new HashMap<>();
		for (int num : A) {
			frequency.put(num, frequency.getOrDefault(num, 0) + 1);
		}

		int count = 0;
		for (int value : frequency.values()) {
			if (value == 1) {
				count++;
			}
		}
		System.out.println(frequency);
		return count;
	}
}


public class MapCountNumbers {
	public static void main(String[] args) {
		int[] arrayInt = new int[] { 1, 1, 2, 2, 3, 4, 5};
		Exercise exercise = new Exercise();
		System.out.println(exercise.countUnique(arrayInt));
	}
}
