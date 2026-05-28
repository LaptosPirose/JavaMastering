package comparables;

import java.util.Objects;

public class Produto implements Comparable<Produto> {

	private String name;
	private double preco;

	public Produto(String name, double preco) {
		super();
		this.name = name;
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, Double.valueOf(preco));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}

	@Override
	public String toString() {
		return "Produto [name=" + name + ", preco=" + preco + "]";
	}

	@Override
	public int compareTo(Produto o) {
		return Double.compare(this.preco, o.preco);
	}

}
