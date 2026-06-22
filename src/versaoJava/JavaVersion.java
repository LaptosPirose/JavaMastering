package versaoJava;

public class JavaVersion {
	public static void main(String[] args) {
		
		Runtime runTime = Runtime.getRuntime();
		System.out.println("A versão do Java usado é: " + Runtime.version() );
		System.out.println("Os processadores disponíveis são:" + runTime.availableProcessors());
		
		System.out.println(System.getProperty("java.version"));
	}
}
