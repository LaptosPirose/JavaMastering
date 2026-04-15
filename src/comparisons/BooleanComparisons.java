package comparisons;

public class BooleanComparisons {
    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        System.out.println(String.format("Java: %b.\n", biologyGrade > chemistryGrade));

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        System.out.println(String.format("Java: %b.\n", sales > costs));

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        System.out.println(String.format("Java: %b.\n", temperature < targetTemperature));

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        System.out.println(String.format("Java: %b.\n", currentSpeed < speedLimit));

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        System.out.println(String.format("Java: %b.\n", age >= retirementAge));

        double salary = 50000.0;
        double maxSalary = 60000.0;
        System.out.println("Me: Hi Java, is my salary less than or equal to the maximum salary?");
        System.out.println(String.format("Java: %b.\n", salary <= maxSalary));

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        System.out.println(String.format("Java: %b.\n", myGrade == bestGrade));

        int phoneNumber = 5551234;
        int contactNumber = 5551234;
        System.out.println("Me: Hi Java, is this the correct phone number for my contact?");
        System.out.println(String.format("Java: %b.\n", phoneNumber == contactNumber));

        char letter1 = 'a';
        char letter2 = 'b';
        System.out.println("Me: Hi Java, are these two letters different?");
        System.out.println(String.format("Java: %b.\n", letter1 != letter2));

        long distance1 = 1000L;
        long distance2 = 500L;
        System.out.println("Me: Hi Java, are these two distances not equal?");
        System.out.println(String.format("Java: %b.\n", distance1 != distance2));

        String word = "hello";
        String secondWord = "hello";

        System.out.println("Me: Are the two words the same?");
        System.out.println(String.format("Java: %b.\n", word.equals(secondWord)));

        String thirdWord = "hello";
        String fourthWord = "goodbye";

        System.out.println("Me: Are the two words different?");
        System.out.println(String.format("Java: %b.\n", !thirdWord.equals(fourthWord)));

    }
}