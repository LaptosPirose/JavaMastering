package sortingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SortingObjects {
	public static void main(String[] args) {
		HashSet<Employee> employeeList = new HashSet<Employee>();

		/**
		 * 
		 */
		employeeList.add(new Employee("Mike", 2500, "Admin", 25));
		employeeList.add(new Employee("John", 3500, "Accounting", 40));
		employeeList.add(new Employee("Luck", 3200, "iT", 34));
		employeeList.add(new Employee("Peter", 12700, "Maintenance", 62));

		ArrayList<Employee> sortedEmployeeList = new ArrayList<Employee>(employeeList);

		Collections.sort(sortedEmployeeList);
		// System.out.println(sortedEmployeeList);

		for (Employee emp : sortedEmployeeList) {
			System.out.println(emp);
		}

		String[] nameStrings = { "Xavier", "Angelo", "Lucas" };
		Arrays.sort(nameStrings);
		System.out.println(nameStrings);
		System.out.println(Arrays.toString(nameStrings));

		Integer[] numberArray = { 1, 2, 10, 3, 4, 6, 7, 2, 46, 6 };
		Arrays.sort(numberArray);
		System.out.println(Arrays.toString(numberArray));

		System.out.println(Integer.max(1, 2));

		String testeNome = "Angelo Oliveira Moura";
		String substringNome = testeNome.substring(3, 15);
		System.out.println(substringNome);

		StringBuilder testeSb = new StringBuilder();
		testeSb.append("Oliveira ");
		testeSb.append("Moura");
		System.out.println(testeSb);

	}
}
