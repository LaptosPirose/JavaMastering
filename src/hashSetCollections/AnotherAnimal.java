package hashSetCollections;

import java.util.Objects;

public class AnotherAnimal {

	String name;
	int age;

	/**
	 * @param name
	 * @param age
	 */
	public AnotherAnimal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "AnotherAnimal [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(age), name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnotherAnimal other = (AnotherAnimal) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

}
