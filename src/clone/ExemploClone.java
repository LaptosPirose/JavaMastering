package clone;

//1. A classe deve implementar Cloneable para permitir a clonagem
class Pessoa implements Cloneable {
	String nome;
	int idade;

	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// 2. Sobrescrevemos o método clone() da classe Object
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	void exibirInfo() {
		System.out.println("Nome: " + nome + ", Idade: " + idade);
	}
}

public class ExemploClone {
	public static void main(String[] args) {
		try {
			Pessoa p1 = new Pessoa("Ana", 25);

			// 3. Criando a cópia usando o método clone
			Pessoa p2 = (Pessoa) p1.clone();

			System.out.println("Objeto Original:");
			p1.exibirInfo();

			System.out.println("Objeto Clonado:");
			p2.exibirInfo();

			// Provando que são objetos diferentes na memória
			System.out.println("\nOs objetos são o mesmo? " + (p1 == p2));

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		/**
		 * O método clone() em Java é usado para criar uma cópia exata de um objeto. Para usá-lo, a classe
		 * precisa implementar a interface Cloneable, caso contrário, o Java lançará uma exceção 
		 * CloneNotSupportedException. 
		 */
		
		/**
		 * Explicação dos Pontos Chave:
		 * Interface Cloneable: Ela é uma "interface marcadora". Ela não possui métodos, mas avisa à Máquina Virtual 
		 * Java (JVM) que é permitido usar o método super.clone() naquela classe.
		 * super.clone(): Este método faz uma cópia campo a campo (chamada de Shallow Copy ou Cópia Rasa). 
		 * Se o seu objeto tiver apenas tipos primitivos (int, double) ou Strings, isso funciona perfeitamente.
		 * Tratamento de Exceção: O método clone obriga você a tratar a CloneNotSupportedException.
		 * Cópia Rasa vs. Profunda:
		 * Rasa (Shallow): O exemplo acima. Se a Pessoa tivesse um objeto Endereco, o clone e o original
		 * compartilhariam o mesmo endereço.
		 * Profunda (Deep): Se você precisar que os objetos internos também sejam copiados, você teria que cloná-los
		 * manualmente dentro do método clone(). 
		 * Dica de ouro: Na prática moderna do Java, muitos desenvolvedores preferem usar Construtores de Cópia (
		 * ex: Pessoa(Pessoa outra)
		 * ) em vez do clone(), pois é considerado mais seguro e menos burocrático.
		 */
	}
}
