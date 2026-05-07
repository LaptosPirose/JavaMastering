package concatenacao;

public class ConcatStringBuilder {

	public static void main(String[] args) {
		int[] arrayInt = new int[] { 1, 2, 3, 4, 5 };

		addElements(arrayInt);
	}

	public static void addElements(int[] input) {
		StringBuilder elements = new StringBuilder();
		elements = elements.append("Elements:");

		for (Object i : input) {
			elements.append(" ").append(i).append(",");
		}

		System.out.println(elements);
	}

}
