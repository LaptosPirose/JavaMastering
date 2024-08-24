package file_processing;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import com.exceptions.FooRunTimeExceptions;

public class Application {

	public static void main(String[] args) { // throws Exception or FileNotFoundException {
		System.out.println("File Processing!");

		/*
		 * Get some text from keyboard
		 */

//		Scanner scanner = new Scanner (System.in);
//		System.out.println("Enter some text:");
//		
//		String input = scanner.nextLine();
//		
//		System.out.println(input);

		/*
		 * Open and read a file
		 */

//		try {
//			File file = new File("myfile.txt");
//			Scanner read = new Scanner(file);
//
//			while (read.hasNextLine()) {
//				String line = read.nextLine();
//				System.out.println(line);
//			}
//			read.close();
//		} catch (Exception e) { // or FileNotFoundException
//			System.out.println("FileNotFound");
//			e.printStackTrace();
//		}

		MyFileUtils myFileUtils = new MyFileUtils();
		try {
			System.out.println(myFileUtils.subtract10FromLargeNumber(9));
		} catch (FooRunTimeExceptions e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
