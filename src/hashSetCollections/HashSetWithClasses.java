package hashSetCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetWithClasses {
	public static void main(String[] args) {

		HashSet <AnotherAnimal> hashSetAnimals = new HashSet <AnotherAnimal>();
		LinkedHashSet<AnotherAnimal> linkedHashAnimals = new LinkedHashSet<AnotherAnimal>();
		
		AnotherAnimal animalOne = new AnotherAnimal("Dog", 10);
		AnotherAnimal animalTwo = new AnotherAnimal("Cat", 5);
		AnotherAnimal animalThree = new AnotherAnimal("Dog", 10);
		AnotherAnimal animalFour = new AnotherAnimal("Elephant", 20);
		
		hashSetAnimals.add(animalOne);
		hashSetAnimals.add(animalTwo);
		hashSetAnimals.add(animalThree);
		hashSetAnimals.add(animalFour);
		
		System.out.println(hashSetAnimals);
		
		// Se você não implementar os métodos hashCode e equals o que vai acontecer é:
		// Sem o método equals, embora os objetos tenhas os mesmos valores nos atributos,
		// ele vai compará-los como diferentes. Fazendo um override em equals ele começa a 
		// considerar os valores para comparação
		// Sem o método hashCode, o HashSet vai refazer o código Hash a partir dos valores das
		// variáveis de não de outro modo. E aí sim, vai impedir que objetos com valores iguais
		// de atributos sejam inseridos.
		
		

	}
}
