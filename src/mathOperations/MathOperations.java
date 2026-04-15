package mathOperations;

public class MathOperations {
    public static void main(String[] args) {

        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 250_000_000_000L; // 250 billion
        long starsInAndromeda = 1_000_000_000_000L; // 1 trillion

        double testScore = 6.7;

        System.out.println(String.format("Fred and George collected %d sweets", bagOfSweets1 + bagOfSweets2));
        System.out.println(String.format("There are %d stars in the Milky Way and Andromeda galaxies.",
                starsInMilkyWay + starsInAndromeda));

        System.out.println(String.format("Fred has %d more sweets than George", bagOfSweets2 - bagOfSweets1));
        System.out.println(String.format("The Andromeda Galaxy has %d more stars than the Milky Way",
                starsInAndromeda - starsInMilkyWay));

        System.out.println(String.format(
                "Snape made an error on his excel, accidentally multiplying Ron's score to: %.2f.", testScore * 10));
        System.out.println(
                String.format("Snape caught the error. Furious, he divided Ron's score to: %.2f.", testScore / 10));

        System.out.println(
                String.format("10 is an even number, since dividing 10 by 2 has a remainder of: %d.", 10 % 2));
        System.out.println(String.format("5 is an odd number, since dividing 5 by 2 has a remainder of: %d.", 5 % 2));

        int counter = 0;
        System.out.println(counter);
        counter++;
        System.out.println(counter);

    }
}