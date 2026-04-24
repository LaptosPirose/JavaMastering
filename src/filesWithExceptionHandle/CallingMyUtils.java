package filesWithExceptionHandle;

import filesWithExceptionHandle.MyUtils.CreatedException;

public class CallingMyUtils {
	public static void main(String[] args) {
		MyUtils utils = new MyUtils();

		// Try de um throw padrão do Java
		try {
			System.out.println(utils.returnPlusTen(20));
			utils.returnPlusTen(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		// Try de um throw de Excepetion criada
		try {
			System.out.println(utils.returnPlusTwenty(10));
		} catch (CreatedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
