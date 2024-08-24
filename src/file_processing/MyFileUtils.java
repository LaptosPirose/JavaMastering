package file_processing;

import com.exceptions.FooRunTimeExceptions;

public class MyFileUtils {

	public int subtract10FromLargeNumber(int number) throws FooRunTimeExceptions{
		if (number < 10)
		{
			throw new FooRunTimeExceptions("Number less than 10!");
		}
		return number - 10;
	}
}

