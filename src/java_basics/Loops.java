package java_basics;

public class Loops {

	public static void main(String[] args) {
		
		int count = 1;
		
		while(count <=100) {
			System.out.println(count);
			count++;
			if (count > 20) {
				break;
			}
		}
		
		String texto = "moeda de valor";
		System.out.println(texto.toUpperCase());
			
		for (int index = 0; index < 11; index++ ) {
			System.out.println(index);
		}
	}

}
