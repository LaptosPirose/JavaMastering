package hashMapStudy;

import java.util.Map;
import java.util.TreeMap;

public class HashMapStudy {
	public static void main(String[] args) {
		System.out.println("Estudo de HashMap__!");

//		Note que o HashMap não apresentará os dados na ordem, mas LinkedHashMap sim.
//		O TreeMap vai já colocar os itens em ordem alfabética da chave. Não armazenam dados duplicados.

		TreeMap<String, String> dictionary = new TreeMap<String, String>();
		dictionary.put("Brave", "Ready to face and endure danger");
		dictionary.put("Joy", "Feeling of great pleasure and happiness");
		dictionary.put("Brilliant", "Exceptionally clever or talented");
		dictionary.put("Brilliant", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

		for (String word : dictionary.keySet()) {
			System.out.println(String.format("The word is: %s, that means: %s.", word, dictionary.get(word)));
		}

		System.out.println("*".repeat(70));

		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(String.format("The word is: %s, that means: %s.", entry.getKey(), entry.getValue()));
		}

	}
}
