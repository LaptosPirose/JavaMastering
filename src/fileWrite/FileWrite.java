package fileWrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) {
		 try (FileWriter writer = new FileWriter("output.txt")) {
	            writer.write("Hello, File!\n");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
