package newFileReaderWay;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {

		BufferedReader bufferedReader = null;
		File file = null;

		try {

			file = new File("myfilea.txt");
			FileReader fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}

			System.out.println("I read the file!");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage() + "== File not Found. ==" + file.getName());
		} catch (IOException e) {
			System.out.println(e.getMessage() + "== File can't be read. ==" + file.getName());
		} finally {
			try {
				bufferedReader.close();
				System.out.println("I closed the buffer!");
			} catch (IOException e) {
				System.out.println(e.getMessage() + "== File can't be closed. ==" + file.getName());
			} catch (NullPointerException e) {
				System.out.println(e.getMessage() + "== File can't be reached. ==" + file.getName());
			}
		}

	}
}
