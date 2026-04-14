package loops;

public class LoopPractice {
	public static void main(String[] args) {
		int count = 0;

		while (count <= 20) {
			System.out.println(String.format("Número: %d.", count));
			count++;

			if (count == 10) {
				break;
			}
		}
	}
}
