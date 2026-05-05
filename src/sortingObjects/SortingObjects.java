package sortingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SortingObjects {
	public static void main(String[] args) {
		HashSet<Employee> employeeList = new HashSet <Employee>();
			
		employeeList.add(new Employee("Mike", 2500, "Admin"));
		employeeList.add(new Employee("John", 3500, "Accounting"));
		employeeList.add(new Employee("Luck", 3200, "iT"));
		employeeList.add(new Employee("Peter", 2700, "Maintenance"));
		
		ArrayList<Employee> sortedEmployeeList = new ArrayList<Employee>(employeeList);
		
		Collections.sort(sortedEmployeeList);
		System.out.println(sortedEmployeeList);
	}
}
