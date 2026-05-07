package generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WithGenerics {
	public static void main(String[] args) {
		// Aula 1 Generics
		Container<Integer, String> container = new Container<>(120, "Teste Two");
		Container<Double, Integer> containerTwo = new Container<>(130.4, 120);
//		container.printItems();
//
//		System.out.println(container.getClass());
//		System.out.println(container.getItemOne().getClass());
//		System.out.println(container.getItemTwo().getClass());

		Set<String> mySetOne = new HashSet<String>();
		mySetOne.add("tipo");
		mySetOne.add("um");
		mySetOne.add("dois");
		mySetOne.add("um");

		Set<String> mySetTwo = new HashSet<String>();
		mySetTwo.add("assim");
		mySetTwo.add("que");
		mySetTwo.add("se");
		mySetTwo.add("um");
		mySetTwo.add("dois");
		System.out.println(union(mySetOne, mySetTwo));

		Set<Integer> mySetOneInteger = new HashSet<Integer>();
		mySetOneInteger.add(10);
		mySetOneInteger.add(20);
		mySetOneInteger.add(30);
		mySetOneInteger.add(10);

		Set<Integer> mySetTwoInteger = new HashSet<Integer>();
		mySetTwoInteger.add(40);
		mySetTwoInteger.add(50);
		mySetTwoInteger.add(10);
		mySetTwoInteger.add(60);
		mySetTwoInteger.add(20);
		// System.out.println(union(mySetOneInteger, mySetTwoInteger));

		unionTransf(mySetOne, mySetTwo);
		System.out.println(mySetOne);
		System.out.println(mySetTwo);

		Set<String> unionResult = union(mySetOne, mySetTwo);
		Iterator<String> itr = unionResult.iterator();

//		for (String item : unionResult) {
//			System.out.println(item);
//		}
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static <E> Set<E> union(Set<E> setOne, Set<E> setTwo) {
		Set<E> result = new HashSet<E>(setOne);
		result.addAll(setTwo);
		return result;
	}

	// Altera o objeto principal passado como referência pelo main (mySetOne),
	// porque
	// mesmo passando como parâmetro, ele altera a referência do endereço
	// Se tirar os comentários da primeira linha, ele não altera, porque cria uma
	// imagem
	// em outra referência.
	public static <T> void unionTransf(Set<T> setOneTransf, Set<T> setTwoTransf) {
		// Set<T> result = new HashSet<T>(setOneTransf);
		setOneTransf.addAll(setTwoTransf);
		System.out.println(setOneTransf);
		System.out.println(setTwoTransf);
		// System.out.println(result);
	}
}
