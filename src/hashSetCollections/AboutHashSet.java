package hashSetCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class AboutHashSet {
	public static void main(String[] args) {

		HashSet<Integer> randomNumbers = new HashSet<Integer>();
		// Hash set doesn't repeat the numbers and don't manage the items in sequence of insertion
		int min = 0;
		int max = 1000;

		Random random = new Random();

		for (int i = 0; i <= 100; i++) {
			int randomItem = random.nextInt(min, max);
			if (randomNumbers.contains(random)) {
				i--;
				System.out.println("in");
			} else {
				randomNumbers.add(randomItem);
			}
		}

		// This is used to
		//		for (int value :randomNumbers) {
		//			System.out.println(value);
		//		}

		System.out.println(randomNumbers);
		System.out.println(randomNumbers.size());

		System.out.println(randomNumbers.contains(332));
		
		// See the sequence doesn's matter
		
		HashSet <String> hashSetString = new HashSet<String>();
		hashSetString.add("Google");
		hashSetString.add("Microsoft");
		hashSetString.add("Apple");
		hashSetString.add("Google");
		hashSetString.add("Apple");
		
		System.out.println(hashSetString);
		
		// In LinkedHashSet the order matters and the values are show as they are inserted 
		LinkedHashSet<String> linkedHashSetString = new LinkedHashSet<String>();
		linkedHashSetString.add("Google");
		linkedHashSetString.add("Microsoft");
		linkedHashSetString.add("Apple");
		linkedHashSetString.add("Google");
		linkedHashSetString.add("Apple");
		
		System.out.println(linkedHashSetString);
	}
	
}
