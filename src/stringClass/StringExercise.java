package stringClass;

public class StringExercise {
	public static void main(String[] args) {
		String str = "We have a large inventory of things in our warehouse falling in the category: apperal and the slightly more in demand category: makeup along with the category: forniture and...";

		printCategories(str);

	}

	/**
	 * Method name: printCategories
	 * 
	 * @param str (String)
	 * 
	 *            Inside the method: Receive the string and extract all categories
	 *            from argument
	 */
	public static void printCategories(String str) {
		int position = 0;
		int blankSpace = 0;
		int categoryLength = "category:".length();
		int pointToSearch = 0;

		position = str.indexOf("category:", 0);

		while (true) {
			if (position >= 0) {

				pointToSearch = position + categoryLength +1;
				
				while(str.charAt(pointToSearch) == ' ' ) {
					position++;
					pointToSearch = position + categoryLength + 1;
					if (str.charAt(pointToSearch) != ' ') {
						break;
					}
				}
				
				blankSpace = str.indexOf(" ", pointToSearch);

				System.out.println(str.substring(pointToSearch, blankSpace));

			} else if (position == -1) {
				break;
			}
			position = str.indexOf("category:", pointToSearch);
		}

	}
}
