package genericsEstudoOne;

public class Application {
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>(10);
		System.out.println(intBox); // Output: Box containing: 10

		intBox.setValue(190);
		System.out.println(intBox.getValue());
		

		Box<String> stringBox = new Box<>("Hello");
		System.out.println(stringBox); // Output: Box containing: Hello
	}
}
