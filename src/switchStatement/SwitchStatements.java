package switchStatement;

public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "rainy";
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy,
        // snowy)
        // Decide whether to use if-else or switch

        // Will execute all lines down the true line. Once it discover a case "rainy",
        // all lines below will be execute as true. This is why we use "break".

        System.out.println("Without break word.");
        System.out.println("*".repeat(50));
        switch (weather) {
            case "sunny":
                System.out.println("You can wear a shirt.");
            case "cloudy":
                System.out.println("You can wear a sweater.");
            case "rainy":
                System.out.println("You can wear a raincoat.");
            case "snowy":
                System.out.println("You can wear a jacket.");
            default:
                System.out.println("You can wear whatever you want.");
        }

        System.out.println();
        System.out.println("With break word.");
        System.out.println("*".repeat(50));
        switch (weather) {
            case "sunny":
                System.out.println("You can wear a shirt.");
                break;
            case "cloudy":
                System.out.println("You can wear a sweater.");
                break;
            case "rainy":
                System.out.println("You can wear a raincoat.");
                break;
            case "snowy":
                System.out.println("You can wear a jacket.");
                break;
            default:
                System.out.println("You can wear whatever you want.");
        }

        // Section 2: User role
        int role = 2;
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3:
        // user)
        // Decide whether to use if-else or switch

        switch (role) {
            case 1:
                System.out.println("You're an admin.");
                break;
            case 2:
                System.out.println("You're an editor.");
                break;
            case 3:
                System.out.println("You're an user.");
                break;
            default:
                System.out.println("Go to HR.");
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        // Determine the comfort level based on both temperature and humidity (e.g., too
        // hot, too cold, comfortable)
        // Decide whether to use if-else or switch

        if (temperature >= 75 && humidity >= 65) {
            System.out.println("Too hot!");
        } else if (temperature >= 60 && humidity >= 40) {
            System.out.println("Comfortable.");
        } else {
            System.out.println("Too cold!");
        }

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        if (age >= 21 && income > 40) {
            System.out.println("You're eligible to credit card.");
        } else {
            System.out.println("You're not eligible to credit card.");
        }

        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green,
        // yellow, red)
        // Decide whether to use if-else or switch

        switch (lightColor) {
            case "green":
                System.out.println("You can go!");
                break;
            case "yellow":
                System.out.println("Atention!");
                break;
            case "red":
                System.out.println("You must stop.");
                break;
            default:
        }

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        if (grade >= 80) {
            System.out.println("You've got an A!");
        } else if (grade >= 70) {
            System.out.println("You've got a B.");
        } else if (grade >= 60) {
            System.out.println("You've a C.");
        } else if (grade >= 50) {
            System.out.println("You've got a D.");
        } else if (grade >= 40) {
            System.out.println("You've got an F.");
        } else {
            System.out.println("You failed.");
        }

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge,
        // or Opera
        // Decide whether to use if-else or switch

        switch (browser) {
            case "Chrome":
                System.out.println("You're using Chrome.");
                break;
            case "Firefox":
                System.out.println("You're using Firefox.");
                break;
            case "Safari":
                System.out.println("You're using Safari.");
                break;
            case "Edge":
                System.out.println("You're using Edge.");
                break;
            case "Opera":
                System.out.println("You're using Opera.");
            default:
                System.out.println("You're not using any of them.");
        }

    }
}
