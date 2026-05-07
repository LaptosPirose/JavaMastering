package generics;

import java.util.ArrayList;

public class AsRawType {
	public static void main(String[] args) {

		ArrayList myList = new ArrayList();
		myList.add("hello");
		myList.add(100);
		myList.add(false);

		// Sem definição de tipo para cada item, você não consegue pegar
		// o valor sem fazer parse.
		// String myVal = myList.get(0);

		// Dois jeitos de fazer o Parse
		String myVal = (String) myList.get(0);
		System.out.println(myVal);
		myVal = myList.get(0).toString();
		System.out.println(myVal);

		// Nesse modo, sem definir o tipo, não é possível simplesmente imprimir com
		// sysout
		// System.out.println(mylist);

		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(10);
		integerList.add(20);

		// Ao definir o tipo, é sim possível imprimir direto no sysout
		System.out.println(integerList);

	}
}
