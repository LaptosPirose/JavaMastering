package padrao;
public class Tests {
    public static void main(String[] args) {
        System.out.println("Hello Tests__!");
        printMeasurements(10);
    }

    public static void printMeasurements(double feet) {
        System.out.println("Feet: " + feet);
        System.out.println("Meters: " + feetToMeters(feet));
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

}
