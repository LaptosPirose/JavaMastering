package newFileReaderWay;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ApplicationNewWay {
	public static void main(String[] args) {
		File file = new File("myfile.txt");
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {

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
		}

	}
}
