package genericsEstudoTwo;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {

		Integer[] simpleArrayInteger = new Integer[] { 10, 20, 30 };

		Integer[] returnArray = ArrayUtils.reverseArray(simpleArrayInteger);
		for (int i=0; i< returnArray.length; i++) {
			System.out.println(returnArray[i]);
		}
	}
}
