package strings;

public class StringComparisons {
    public static void main(String[] args) {
        String firstWord = "hello";
        String secondWord = "not hello";
        String thirdWord = "hello";
        String fourthWord = "yes";

        System.out.println(firstWord.equals(secondWord));
        System.out.println(!thirdWord.equals(fourthWord));
    }

}
