package genericsEstudoOne;

public class Box<T> {

	private T value;

	public Box(T i) {
		this.value = i;
	}

	public T getValue() {
		return this.value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Box containing: " + (value != null? value.toString() : "null");
	}
}
