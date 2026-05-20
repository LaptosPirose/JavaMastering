package genericsOne;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		Object myObject = new Object();

		Accountant acc = new Accountant();
		Employee emp = new Employee();

		emp = acc; // only can convert accountant to employee because accountant is an employee but
					// employee is not an accountant;

		ArrayList<Employee> employees = new ArrayList<>();

		employees.add(new Employee());
		employees.add(new Employee());
		employees.add(new Employee());
		employees.add(new Employee());

		ArrayList<Accountant> accountants = new ArrayList<>();

		accountants.add(new Accountant());
		accountants.add(new Accountant());
		accountants.add(new Accountant());
		accountants.add(new Accountant());

		// employees = accountants; You can not do this, because with generics, the
		// polymorphism doesn't work

		// Generic upper bound

		ArrayList<Object> employeesOne = new ArrayList<>();
		ArrayList<Accountant> accountantsOne = new ArrayList<>();

		// employeesOne = accountantsOne; Not allowed even if is ArrayList of objects

		// Now this is called wild cards
		ArrayList<?> employeesTwo = new ArrayList<>();
		ArrayList<String> accountantsTwo = new ArrayList<>();

		employeesTwo = accountantsTwo;

		// This is allowed because ? signal means that does not matter the type of what
		// you trying to copy and does not not matter the employeesTwo types

		ArrayList<? extends Employee> employeesThree = new ArrayList<>(); // upperbound - only child of EMployee are
																			// allowed
		ArrayList<Accountant> accountantsThree = new ArrayList<>();

		employeesThree = accountantsThree;

		// Means that are only allowed to copy if the class to copy extends (or is type
		// of) Employee.
		// If you change the Accountant type in angle brackets where written, will not
		// work.

		// Generic lower bound

		ArrayList<? super Employee> employeesFour = new ArrayList<>();
//		ArrayList<Accountant> accountantsFour = new ArrayList<>();
		ArrayList<Object> accountantsFour = new ArrayList<>();
		// Only fathers of Employee are allowed
		// Accountants aren't parents to employees, but Object is.
		employeesFour = accountantsFour;

		// makeEmployeeWork(employees);
		makeEmployeeWork(accountants); // This is not allowed because the same issue, when use generics with list it
										// will not work. Using method like List<Employee> but yes for List<? extends
										// Employee>
	}

//	public static void makeEmployeeWork(List<Employee> employees) {
//		for (Employee emp : employees) {
//			emp.work();
//		}
//	}

//	public static void makeEmployeeWork(List<? extends Employee> employees) {
//		for (Employee emp : employees) {
//			emp.work();
//		}
//	}

	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for (Accountant emp : (ArrayList<Accountant>) employees) { // Accountant type casting for some that extends
																	// Employee _ ignoring type safety. Be careful
			emp.work();
		}
	}
}
