package exercise;

import java.util.ArrayList;

public class VariableDefinition {
    public static void main(String[] args) {

        /*
         * Int variable definitions
         */
        int myVariable = 10;
        System.out.println("The value of myVariable is: " + myVariable);
        myVariable = 20;
        System.out.println("The new value of myVariable is: " + myVariable);

        /*
         * Calling an private method to define max and min values for
         * variable definitions
         */

        defineMaxAndMinValues();

        /*
         * Defining a String variable
         */
        String myString = "Hello World!";
        System.out.println("The value of myString is: " + myString);

        /*
         * Defining a boolean variable
         */
        boolean myBoolean = true;
        System.out.println("The value of myBoolean is: " + myBoolean);

        /*
         * Defning a array variable
         */
        int[] myArray = { 1, 2, 3, 4, 5 };
        System.out.println("The elements of myArray are: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        int[] myArray1 = new int[10];
        for (int i = 0; i < 10; i++) {
            myArray1[i] = i;
            System.out.println(i);
            System.out.println(myArray1[i]);
        }
        
        System.out.println("\nThe elements of myArray1 are: " + myArray1);

        /*
         * Defining a ArrayList variable
         */
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Cherry");
        System.out.println("\nThe elements of myArrayList are: ");
        for (String fruit : myArrayList) {
            System.out.print(fruit + " ");
        }

    }

    private static void defineMaxAndMinValues() {

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("The minimum value for a byte is: " + minByteValue);
        System.out.println("The maximum value for a byte is: " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("The minimum value for a short integer is: " + minShortValue);
        System.out.println("The maximum value for a short integer is: " + maxShortValue);

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("The minimum value for an integer is: " + minIntValue);
        System.out.println("The maximum value for an integer is: " + maxIntValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("The minimum value for a long integer is: " + minLongValue);
        System.out.println("The maximum value for a long integer is: " + maxLongValue);

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("The minimum value for a float is: " + minFloatValue);
        System.out.println("The maximum value for a float is: " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("The minimum value for a double is: " + minDoubleValue);
        System.out.println("The maximum value for a double is: " + maxDoubleValue);
    }

}
