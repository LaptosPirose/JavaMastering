package arrayListStudyAllCopy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSort {
	public static void main(String[] args) {

		HashSet<Integer> integerHasSet = new HashSet<Integer>();

		integerHasSet.add(10);
		integerHasSet.add(40);
		integerHasSet.add(5);
		integerHasSet.add(1);

		ArrayList<Integer> sortedIntegerList = new ArrayList<Integer>(integerHasSet);

		Collections.sort(sortedIntegerList);
		System.out.println(sortedIntegerList);

	}
}
