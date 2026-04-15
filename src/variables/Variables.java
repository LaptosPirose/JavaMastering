package variables;

/*
 * Java Primitive Types Demonstration
 *
 * This program demonstrates the basic primitive data types in Java
 * and prints their maximum values when applicable.
 *
 * Primitive Types Categories:
 *
 * 1. Boolean
 * 2. Character
 * 3. Integer numeric types
 * 4. Floating-point numeric types
 */
public class Variables {

    public static void main(String[] args) {

        System.out.println("Java Primitive Types Demo\n");

        // ==================================================
        // 1. BOOLEAN
        // ==================================================

        /*
         * boolean
         *
         * Represents two possible logical values:
         * true or false.
         *
         * The exact memory size is not defined by the Java specification.
         */

        boolean isJavaFun = true;

        System.out.println("Boolean value: " + isJavaFun);

        // ==================================================
        // 2. CHARACTER
        // ==================================================

        /*
         * char
         *
         * Size: 2 bytes (16 bits)
         * Represents a single UTF-16 character.
         *
         * Characters use single quotes.
         */

        char letter = 'J';

        System.out.println("Character value: " + letter);

        // ==================================================
        // 3. STRING (NOT A PRIMITIVE TYPE)
        // ==================================================

        /*
         * String
         *
         * String is not a primitive type.
         * It is a class that represents a sequence of characters.
         *
         * Strings use double quotes.
         */

        String language = "Java";

        System.out.println("String value: " + language);

        // ==================================================
        // 4. INTEGER NUMERIC TYPES
        // ==================================================

        /*
         * Numeric literals (VERY IMPORTANT)
         *
         * Java allows the use of underscore (_) as a thousands separator
         * to improve readability of numeric values.
         *
         * Example:
         * int number = 1_000_000;
         * long bigNumber = 9_223_372_036_854_775_807L;
         *
         * Rules:
         * - Cannot start or end with underscore
         * - Cannot be next to a decimal point
         * - Cannot be before suffixes (L, F, etc.)
         */

        int readableNumber = 1_000_000;
        System.out.println("Readable int with underscores: " + readableNumber);

        /*
         * byte
         *
         * Size: 1 byte (8 bits)
         * Range: -128 to 127
         */

        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Max byte value: " + maxByte);

        /*
         * short
         *
         * Size: 2 bytes (16 bits)
         */

        short maxShort = Short.MAX_VALUE;
        System.out.println("Max short value: " + maxShort);

        /*
         * int
         *
         * Size: 4 bytes (32 bits)
         */

        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max int value: " + maxInt);

        /*
         * long
         *
         * Size: 8 bytes (64 bits)
         *
         * Long literals commonly use the suffix 'L'.
         * Example: long number = 100_000L;
         */

        long maxLong = Long.MAX_VALUE;
        System.out.println("Max long value: " + maxLong);

        // ==================================================
        // 5. FLOATING POINT TYPES
        // ==================================================

        /*
         * float
         *
         * Size: 4 bytes
         * Used for decimal numbers.
         *
         * Float literals require the suffix 'f'.
         * Example: float price = 10.5f;
         *
         * Underscores can also be used:
         * float value = 1_000.50f;
         */

        float maxFloat = Float.MAX_VALUE;
        System.out.println("Max float value: " + maxFloat);

        /*
         * double
         *
         * Size: 8 bytes
         * Used for decimal numbers with higher precision.
         *
         * Example with underscore:
         * double value = 1_000_000.75;
         */

        double maxDouble = Double.MAX_VALUE;
        System.out.println("Max double value: " + maxDouble);

    }
}