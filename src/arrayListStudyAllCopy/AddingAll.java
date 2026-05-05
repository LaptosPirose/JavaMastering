package arrayListStudyAllCopy;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddingAll {
	public static void main(String[] args) {
		ArrayList<Integer> listOne = new ArrayList<Integer>();

		listOne.add(120);
		listOne.add(345);
		listOne.add(43);
		listOne.add(67);

		ArrayList<Integer> newList = new ArrayList<Integer>();

		newList.add(111);

		System.out.println(newList);

		newList.addAll(listOne);
		System.out.println(newList);

		newList.removeAll(listOne);
		System.out.println(newList);

		newList.clear();
		System.out.println(newList);

		LinkedList<String> newLinkedList = new LinkedList<String>();
		newLinkedList.add("Service");
		newLinkedList.add("For");
		newLinkedList.add("All");

		System.out.println(newLinkedList);

		newLinkedList.remove("All");
		System.out.println(newLinkedList);

		newLinkedList.addAll(newLinkedList);
		System.out.println(newLinkedList);
		
		System.out.println(newLinkedList.contains("Service"));
		System.out.println(newLinkedList.isEmpty());

	}
}
