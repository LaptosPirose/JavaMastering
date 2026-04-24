package filesWithExceptionHandle;

import java.io.InputStream;
import java.util.Scanner;

public class Application{
	public static void main(String[] args) {
		
		System.out.println("Leitura de arquivo como recurso...! Class Loader");
		
		try(InputStream is = Application.class.getResourceAsStream("/filesWithExceptionHandle/myfile.txt")){
			
			if (is == null) {
				throw new Exception("Arquivo não encontrado");
			}
			
			Scanner input = new Scanner (is);
			while(input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}