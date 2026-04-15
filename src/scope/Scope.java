package scope;

public class Scope {

    // Global variables to store the rectangle's length and width (accessible within
    // the whole class)
    // static double length = 2;
    // static double width = 4;

    static double length = 2; // Now these two variables are globals
    static double width = 4; // Accessed by all entire class

    public static void main(String[] args) {

        // double length = 3;
        // double width = 4;

        calculateArea(length, width);
        calculatePerimeter(length, width);

    }

    public static void calculateArea(double param1, double param2) {
        // Local variable to store the area (accessible only within this function)
        double area = param1 * param2;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void calculatePerimeter(double param1, double param2) {
        // Local variable to store the perimeter (accessible only within this function)
        double perimeter = 2 * (param1 + param2);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
