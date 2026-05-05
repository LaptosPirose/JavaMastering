package arrayListStudyAllCopy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashToList {
	public static void main(String[] args) {

		HashSet<String> newStringArrayList = new HashSet<String>();

		newStringArrayList.add("Service");
		newStringArrayList.add("All");
		newStringArrayList.add("tring");
		newStringArrayList.add("True");
		
		List<String> convertedHash = new ArrayList<String>(newStringArrayList);
		System.out.println(convertedHash);
		System.out.println(convertedHash.getClass());
		
		System.out.println(newStringArrayList.getClass());
	}
}
