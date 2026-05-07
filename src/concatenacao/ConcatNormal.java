package concatenacao;

public class ConcatNormal {
	public static void main(String[] args) {
		int[] arrayInt = new int[] { 1, 2, 3, 4, 5 };
		addElements(arrayInt);
	}

	public static void addElements(int[] input) {
		String elements = "";

		elements = elements.concat("Elements: ");

		for (Object i : input) {
			elements = elements.concat(i.toString()+ " ");
		}
		elements.trim();
		System.out.println(elements);
	}

}
