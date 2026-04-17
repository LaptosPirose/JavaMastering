package serialize;

import java.io.Serializable;

public class Jogador implements Serializable {
	private static final long serialVersionUID = 1L; // Identificador de versão

	private String nome;
	private int nivel;
	private transient String senhaToken; // transient: NÃO será salvo no arquivo

	public Jogador(String nome, int nivel, String senhaToken) {
		this.nome = nome;
		this.nivel = nivel;
		this.senhaToken = senhaToken;
	}

	@Override
	public String toString() {
		return "Jogador{nome='" + nome + "', nivel=" + nivel + ", senhaToken='" + senhaToken + "'}";
	}
}
