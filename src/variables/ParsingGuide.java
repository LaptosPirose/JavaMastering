package variables;

/*
 * ============================================================
 * JAVA PARSING GUIDE
 * ============================================================
 *
 * This file demonstrates how to convert (parse) variables in Java.
 *
 * Topics covered:
 * 1. Primitive Casting
 * 2. String to Primitive Parsing
 * 3. Primitive to String Conversion
 * 4. Error Handling (NumberFormatException)
 *
 * Author: Angelo Moura (custom study material)
 * ============================================================
 */

public class ParsingGuide {

    public static void main(String[] args) {

        printSection("1. PRIMITIVE CASTING");

        primitiveCasting();

        printSection("2. STRING TO PRIMITIVE PARSING");

        stringToPrimitive();

        printSection("3. PRIMITIVE TO STRING");

        primitiveToString();

        printSection("4. ERROR HANDLING");

        errorHandling();
    }

    /*
     * ============================================================
     * SECTION FORMATTER
     * ============================================================
     */
    public static void printSection(String title) {
        System.out.println("\n==================================================");
        System.out.println(title);
        System.out.println("==================================================");
    }

    /*
     * ============================================================
     * 1. PRIMITIVE CASTING
     * ============================================================
     */
    public static void primitiveCasting() {

        // Implicit Casting (Widening)
        int intValue = 10;
        double doubleValue = intValue; // automatic conversion

        System.out.println("Implicit Casting (int -> double): " + doubleValue);

        // Explicit Casting (Narrowing)
        double anotherDouble = 10.75;
        int convertedInt = (int) anotherDouble; // loses decimal part

        System.out.println("Explicit Casting (double -> int): " + convertedInt);
    }

    /*
     * ============================================================
     * 2. STRING TO PRIMITIVE PARSING
     * ============================================================
     */
    public static void stringToPrimitive() {

        // String -> int
        String intStr = "100";
        int intValue = Integer.parseInt(intStr);
        System.out.println("String to int: " + intValue);

        // String -> double
        String doubleStr = "10.5";
        double doubleValue = Double.parseDouble(doubleStr);
        System.out.println("String to double: " + doubleValue);

        // String -> float
        String floatStr = "3.14";
        float floatValue = Float.parseFloat(floatStr);
        System.out.println("String to float: " + floatValue);

        // String -> long
        String longStr = "100000";
        long longValue = Long.parseLong(longStr);
        System.out.println("String to long: " + longValue);

        // String -> boolean
        String boolStr = "true";
        boolean boolValue = Boolean.parseBoolean(boolStr);
        System.out.println("String to boolean: " + boolValue);
    }

    /*
     * ============================================================
     * 3. PRIMITIVE TO STRING
     * ============================================================
     */
    public static void primitiveToString() {

        int number = 50;

        // Using valueOf
        String text1 = String.valueOf(number);

        // Using concatenation
        String text2 = number + "";

        System.out.println("Using valueOf: " + text1);
        System.out.println("Using concatenation: " + text2);
    }

    /*
     * ============================================================
     * 4. ERROR HANDLING
     * ============================================================
     */
    public static void errorHandling() {

        String invalidNumber = "abc";

        try {
            int value = Integer.parseInt(invalidNumber);
            System.out.println("Converted value: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Error: invalid number format!");
        }
    }
}