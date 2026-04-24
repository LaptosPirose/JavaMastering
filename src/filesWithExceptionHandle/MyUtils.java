package filesWithExceptionHandle;

public class MyUtils {

	public int returnPlusTen(int arg) throws Exception {
		if (arg < 10) {
			throw new Exception("Number less than 10!");
		}
		return arg + 10;
	}

	public int returnPlusTwenty(int arg) throws CreatedException {
		if (arg < 20) {
			throw new CreatedException("Number less than 20!");
		}
		return arg + 20;
	}

	public class CreatedException extends Exception {
		public CreatedException(String message) {
			super(message);
		}
	}
}
