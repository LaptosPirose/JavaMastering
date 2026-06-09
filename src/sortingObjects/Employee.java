package sortingObjects;

public class Employee implements Comparable<Employee> {

	String name;
	int salary;
	String department;
	int age;

	/**
	 * @param name
	 * @param salary
	 * @param department
	 * @param age
	 */
	public Employee(String name, int salary, String department, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.age = age;
	}

//	@Override
//	public int compareTo(Employee o) {
//		if (this.salary < o.salary) {
//			return -1;
//		} else if (this.salary > o.salary) {
//			return 1;
//		}
//		return 0;
//	}

	@Override
	public int compareTo(Employee o) {
		if (this.age > o.age) {
			return -1;
		} else if (this.age < o.age) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + ", age =" + age + "]";
	}

}
