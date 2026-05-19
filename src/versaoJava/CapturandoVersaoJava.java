package versaoJava;

public class CapturandoVersaoJava {
	public static void main(String[] args) {
		System.out.printf("A versão do Java usado é: %s.\n", System.getProperty("java.version"));
		System.out.printf("Saindo__!\n");
		
		Runtime.Version runtimeVersion = Runtime.version();
        System.out.println("Versão completa: " + runtimeVersion);
        System.out.println("Major version: " + runtimeVersion.feature()); // Ex: 17, 21
        
        Runtime time = Runtime.getRuntime();
        System.out.println(time.availableProcessors());
        
        Runtime.Version teste = Runtime.version();
        
	}
}
