package estudoCloneGenerics;

import java.util.Random;

public class Application {
	public static void main(String[] args) {

		// Cria instância de
		Random generator = new Random();
		int n = 10;
		Integer[] otherIntArray = new Integer[n];

		System.out.println("Popula array e depois clona..__!");
		for (int i = 0; i < n; i++) {
			otherIntArray[i] = generator.nextInt();
			System.out.println(otherIntArray[i]);
		}

		Integer[] cloneIntArray = otherIntArray.clone();
		
		System.out.println("Imprime invertida..__!");
		Integer[] returnArray = ArrayUtils.reversingArrays(otherIntArray);
		
		for(int i=0; i< returnArray.length; i++) {
			System.out.println(returnArray[i]);
		}

	}
}
