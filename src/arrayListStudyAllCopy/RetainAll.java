package arrayListStudyAllCopy;

import java.util.ArrayList;

public class RetainAll {
	public static void main(String[] args) {
		ArrayList<String> newStringArrayList = new ArrayList<String>();
		
		newStringArrayList.add("Service");
		newStringArrayList.add("All");
		newStringArrayList.add("String");
		newStringArrayList.add("True");
		
		ArrayList <String> otherStringArrayList = new ArrayList<String>();
		otherStringArrayList.add("True");
		
		newStringArrayList.retainAll(otherStringArrayList);
		System.out.println(newStringArrayList);
	}
}
