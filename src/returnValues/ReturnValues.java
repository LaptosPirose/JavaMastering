package returnValues;

public class ReturnValues {
    public static void main(String[] args) {
        System.out.println(String.format("The area is: %.2f.", calculatearea(2.3, 2.3)));
        System.out.println(String.format("The area is: %.2f.", calculatearea(-1.3, 2.3)));
        System.out.println(explainArea("english"));
        System.out.println(explainArea("french"));
        System.out.println(explainArea("spanish"));
        System.out.println(explainArea("italian"));
    }

    public static double calculatearea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Values must be over the zero.");
            System.exit(0); // App is finished.
        }
        return width * length;
    }

    public static String explainArea(String languageString) {
        switch (languageString.toLowerCase()) {
            case "english":
                return "Area equals length * width";
            case "french":
                return "La surface est egale a la longueur * la largeur";
            case "spanish":
                return "Area es igual a largo * ancho";
            default:
                return "None of them.";
        }
    }
}