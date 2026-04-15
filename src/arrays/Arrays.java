package arrays;

public class Arrays {
    public static void main(String[] args) {
        // Learing arrays

        int[] intArray = new int[100];
        int i = 0;
        for (i = 0; i < 100; i++) {
            intArray[i] = i * 2;
        }

        i = 0;
        for (i = 0; i < 100; i++) {
            System.out.println(intArray[i]);
        }

        String[] nameString = new String[] { "Teste", "Primeira", "Segunda" };
        int[] nameInt = new int[] { 1, 5, 6, 7 };

        nameString[0] = "Zero";
        System.out.println("Teste de impressão. Olá! " + nameString[0] + " " + nameInt[0]);
    }
}
