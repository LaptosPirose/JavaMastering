package jarExercise;

public class ExecutingJar {
	public static void main(String[] args) {
		System.out.println("Executing JAR");
		System.out.println("java -jar arquivo.jar");
		
		System.out.println("Listar conteúdo");
		System.out.println("jar -tvf arquivo.jar");
		// t- table of contents, v - verbose, f - file
		
		System.out.println("Descompactar");
		System.out.println("jar - xvf arquivo.jar");
		// x - extract, v - verbose, f - file
		
		System.out.println("Exportar projeto para JAR.");
		System.out.println("Clique botão direito sobre o nome do projeto e export para Jar");
		
		System.out.println("Criar um arquivo .jar");
		System.out.println("Antes você precisa de um arquivo chamado manifest.mf que indica qual classe tem o método main");
		System.out.println("Depois rodar o comando abaixo:");
		System.out.println("jar -cvfm myprogram.jar manifest.mf *.class");
		System.out.println("Ao criar o arquivo manifest.mf, lembre-se de inserir uma quebra de linha, no final.");
		System.out.println("Conteúdo do arquivo manifest.mf ");
		System.out.println("Main-Class: aquivo");
		System.out.println("Quebra de linha no final.");
		
	}
}
