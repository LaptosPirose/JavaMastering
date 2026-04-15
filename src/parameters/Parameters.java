package parameters;

public class Parameters {
    public static void main(String[] args) {
        calculatearea(2.3, 3.6);
    }

    public static void calculatearea(double length, double width) {
        System.out.println(String.format("%.2f", width * length));
    }
}
