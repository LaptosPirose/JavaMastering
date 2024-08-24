package com.learningfilereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ApplicationTryResources {

	public static void main(String[] args) {

		File file = new File("myfile.txt");
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {

			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println(String.format("Error during code execution : %s.", e.getMessage()));
		} catch (IOException e) {
			System.out.println("Problem reading file:" + file.getName());
		}
	}

}
