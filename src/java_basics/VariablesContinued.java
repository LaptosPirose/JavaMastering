package java_basics;

public class VariablesContinued {

	public static void main(String[] args) {
		System.out.println("Still Learning about Java Variables!");

		/*
		 * About Primitive Data Types.
		 * More info: https://glysns.gitbook.io/java-basico/sintaxe/variaveis
		 */

		/*
		 * Data Type Size Description
		 * byte 1 byte Stores whole numbers from -128 to 127
		 * short 2 bytes Stores whole numbers from -32,768 to 32,767
		 * int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
		 * long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to
		 * 9,223,372,036,854,775,807
		 * float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7
		 * decimal digits
		 * double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal
		 * digits
		 * boolean 1 bit Stores true or false values
		 * char 2 bytes Stores a single character/letter or ASCII values
		 */

		/*
		 * Minimum and Maximum value for Java Variables
		 * S.No. Data Type Size Min. Value Max. Value
		 * 1 Byte 8 -128 127
		 * 2 Short 16 -32768 32767
		 * 3 Integer 32 -2147483648 2147483647
		 * 4 Float 32 1.4E-45 3.4028235E38
		 * 5 Long 64 -9223372036854775808 9223372036854775807
		 * 6 Double 64 4.9E-324 1.7976931348623157E308
		 * 7 Character 16
		 */

		/*
		 * Wrapper Classes
		 * 
		 * Wrapper classes provide a way to use primitive data types (int, boolean,
		 * etc..) as objects.
		 * The table below shows the primitive type and the equivalent wrapper class:
		 * 
		 * Primitive Data Type Wrapper Class
		 * byte Byte
		 * short Short
		 * int Integer
		 * long Long
		 * float Float
		 * double Double
		 * boolean Boolean
		 * char Character
		 */

		/*
		 * An INT variable has 32 bits resolution. It means that a INT variable can be a
		 * number close to 2 ^ 31.
		 * 2 ^ 31 in calculator will give you: 2147483648 that is the negative number.
		 * So the maximum negative number for INT is -2147483648.
		 * The positive number is this number less 1.
		 * So the maximum positive number for INT is 2147483647.
		 */

		int greatInt = 1000000000; // 9 * '0's
		System.out.println(greatInt);
		int minimumValueInt = -2147483648;
		System.out.println("Minimum number accepted by an integer number: " + minimumValueInt + ".");
		int maximumValueInt = 2147483647;
		System.out.println("Maximum number accepted by an integer number: " + maximumValueInt + ".");

		/*
		 * The maximum value min + max is 4294967295,however Java see the number as
		 * signed number.
		 */

		/*
		 * A LONG variable has 64 bits resolution. It means that a LONG variable can be
		 * a number close to 2 ^ 63.
		 * A LONG number must have an 'L' capital in the end;
		 * 2 ^ 63 in calculator will give you: 9223372036854775808 that is the negative
		 * number.
		 * So the maximum negative number for LONG is -9223372036854775808.
		 * The positive number is this number less 1.
		 * So the maximum positive number for LONG is 9223372036854775807.
		 */

		long greatLong = 1000000000000000000L; // 18 * '0's
		System.out.println(greatLong);
		long minimumValueLong = -9223372036854775808L;
		System.out.println("Minimum number accpeted by a long number: " + minimumValueLong + ".");
		long maximumValueLong = 9223372036854775807L;
		System.out.println("Maximum number accpeted by a long number: " + maximumValueLong + ".");

		/*
		 * A SHORT number has 16 bits resolution. It means that a SHORT variable can be
		 * a number close to 2 ^ 15.
		 * 2 ^ 15 in calculator will give you: 32768 that is the negative number.
		 * So the maximum negative number for SHORT is -32768.
		 * The positive number is this number less 1.
		 * So the maximum positive number for SHORT is 32767.
		 */

		short greatShort = 10000; // 4 * '0' s
		System.out.println(greatShort);
		short minimumValueShort = -32768;
		System.out.println("Minimum number accpeted by a short number: " + minimumValueShort + ".");
		short maximumValueShort = 32767;
		System.out.println("Maximum number accpeted by a short number: " + maximumValueShort + ".");

		/*
		 * A BYTE number has 8 bits resolution. It means that a BYTE variable can be a
		 * number close to 2 ^ 7.
		 * 2 ^ 7 in calculator will give you: 128 that is the negative number.
		 * So the maximum negative number for BYTE is -128.
		 * The positive number is this number less 1.
		 * So the maximum positive number for BYTE is 127.
		 */

		byte greatByte = 100; // 2 * '0' s
		System.out.println(greatByte);
		byte minimumValueByte = -128;
		System.out.println("Minimum number accpeted by a short number: " + minimumValueByte + ".");
		byte maximumValueByte = 127;
		System.out.println("Maximum number accpeted by a short number: " + maximumValueByte + ".");

		/*
		 * DOUBLE type in Java is such a primitive data that represents floating number
		 * with double precision
		 * of 64 bits. DOUBLE can storage number with 15 decimal digits precision,
		 * and values range is about 4.9E-324 to 1.7976931348623157E+308.
		 */

		double greatDouble = 1000000000.99999999;
		System.out.println(greatDouble);
		System.out.println("Minimum number accpeted by a double number: 4.9E-324");
		System.out.println("Maximum number accpeted by a double number: 1.7976931348623157E+308.");

		/*
		 * Float type in Java is such a primitive data that represents floating number
		 * with precision
		 * of 32 bits. FLOAT can storage number with 6 or 7 decimal digits precision,
		 * and values range is about 1.40129846432481707E-45 to 3.40282346638528860E+38.
		 */

		double greatFloat = 1000000000.999999;
		System.out.println(greatFloat);
		System.out.println("Minimum number accpeted by a float number: 1.40129846432481707E-45");
		System.out.println("Maximum number accpeted by a float number: 3.40282346638528860E+38.");

		/*
		 * CHAR variable just get one character per once. Like 'a' or something else.
		 * CHAR variable occupy 2 bytes of size.
		 */

		char character = 'Q';
		System.out.println(character);
		System.out.println(Character.SIZE);

		/*
		 * Boolean is the most simple. Just storage True or False.
		 */

		/*
		 * boolean falsy = false;
		 * boolean truly = true;
		 */

		/*
		 * Using Wrapper Classes to get minimum and maximum values and also size of
		 * variables.
		 * 
		 */

		System.out.println("using wrapper classes to get some datas:");
		System.out.println(String.format("The INTEGER variable size is %d.", Integer.SIZE));
		System.out.println(String.format("The minimum value for INTEGER variable is %d.", Integer.MIN_VALUE));
		System.out.println(String.format("The maximum value for INTEGER variable is %d.", Integer.MAX_VALUE));

		System.out.println(String.format("The FLOAT variable size is %d.", Float.SIZE));
		System.out.println(String.format("The minimum value for FLOAT variable is %.20f.", Float.MIN_VALUE));
		System.out.println(String.format("The maximum value for FLOAT variable is %.20f.", Float.MAX_VALUE));

		/*
		 * These methods can be used when you are using Wrapper Classes. And you can use
		 * Wrapper Classes to
		 * create variables, but the variables are created as objects.
		 */

		int number = 205;
		Integer number_oneInteger = 200;
		System.out.println(number_oneInteger);
		System.out.println(number_oneInteger.bitCount(number));
		System.out.println(Integer.bitCount(number));

	}

}
