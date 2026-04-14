package very_start;

public class StaticMethods {

    public static void main(String[] args) {

        // Static members belong to the class itself, not to objects

        System.out.println(Integer.MAX_VALUE);

        Integer numberA = 200;

        // Not recommended, but technically allowed
        System.out.println(numberA.MAX_VALUE);

        
        int result = Math.max(10, 20);

        System.out.println(result);
        
        System.out.println(Byte.MAX_VALUE);
    }

}
