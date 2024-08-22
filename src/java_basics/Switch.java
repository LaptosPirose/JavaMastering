package java_basics;

public class Switch {

	public static void main(String[] args) {
		
		String teste = "Opção 3";
		String result = "";
		
		switch (teste){
		
			case "Opção 1":result = "Opção 1 selecionada";
			break;
		
			case "Opção 2": result = "Opção 2 selecionada";
			break;
			
			default : result = "Nenhuma Opção selecionada.";
		}
		
		System.out.println(result);
	}

}
