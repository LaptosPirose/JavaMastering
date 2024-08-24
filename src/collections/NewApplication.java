package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class NewApplication {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(43);
		list1.add(54);
		list1.add(120);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(230);

		list2.addAll(list2);
		list2.addAll(list1);

		System.out.println(list2);

		list2.removeAll(list1);

		System.out.println(list2);

		list2.removeAll(list2);

		System.out.println(list2);

		// list1.clear();
		// System.out.println(list1);

		HashSet<Integer> values = new HashSet<Integer>();
		values.add(20);
		values.add(30);
		values.add(40);

		for (Integer value : values) {
			System.out.println(value);
		}

		/*
		 * Contains method for lists
		 */
		System.out.println(list1.contains(10) ? "Yes, the value is inside de the list." : "No, the value is outside.");
		System.out.println(list2.contains(10) ? "Yes, the value is inside de the list." : "No, the value is outside.");

		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(43);
		list3.add(54);
		list3.add(10);
		list3.add(120);

		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(54);
		list4.add(43);
		list4.add(10);

		list3.retainAll(list4);
		/*
		 * Remove all the elements in list 3 except the items contained in list4. Retain
		 * all elements equals the elements that are contained in list4.
		 */

		System.out.println(list3);

		/*
		 * Creating elements using lists, hash sets or whatever to populate 
		 */

		HashSet<Integer> hashSet = new HashSet<Integer>(list3);
		System.out.println(list3);
		
		/*
		 * Now, there is with the same content of list3
		 */
		
		/*
		 * Sorting items on list
		 */
		
		Collections.sort(list3);
		System.out.println(list3);
		
		/*
		 * Sorting objects
		 */
		
		Employee employee1 = new Employee("John Travis", 3800, "Logistic");
		Employee employee2 = new Employee("Mike Lugos", 4000, "Financial");
		Employee employee3 = new Employee("Tom Brady", 3700, "Engineering");
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		
		
		for(Employee employee : employeeList) {
			System.out.println(employee);
		}

	}

}
