package java_basics;

class Exemplo {
	
	/*
	 * When you take off class modifier and has no public modifier, the method can only
	 * be visible by classes inside the same package.
	 */
	String nome;
	Integer ano;

	public Exemplo(String nome, Integer ano) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.ano = ano;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the ano
	 */
	public Integer getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public static String returnAll() {
		return "This is a static method";
	}
}
