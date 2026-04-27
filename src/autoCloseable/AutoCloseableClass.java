package autoCloseable;

class MyClass implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing__!");

	}

}

public class AutoCloseableClass {
	public static void main(String[] args) {
		try (MyClass myClass = new MyClass()) {

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("I'm not needed you are using auto closeable.");
		}
	}

}
