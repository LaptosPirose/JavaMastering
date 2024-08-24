package com.learningfilereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

//		try {
//			File file = new File("myfile.txt");
//			Scanner read = new Scanner(file);
//			while (read.hasNextLine()){
//				System.out.println(read.nextLine());
//			}
//			read.close();
//			
//		} catch (Exception e) {
//			System.out.println(String.format("Error during execution : %s.", e.getMessage()));
//		}
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		File file = new File("myfile.txt");
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println(String.format("Error during code execution : %s.", e.getMessage()));
		} catch (IOException e) {
			System.out.println("Problem reading file:" + file.getName());
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				System.out.println("Unable to close file:" + file.getName() + "-> " + e.getMessage());
			} catch (NullPointerException ex) {
				System.out.println("The file was probably never opened..." + ex.getMessage());
			}
		}
	}

}
