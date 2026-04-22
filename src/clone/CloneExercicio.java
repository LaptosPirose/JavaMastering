package clone;

class PessoaOne implements Cloneable {
	String name;
	int age;

	public PessoaOne(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	void exibirInfo() {
		System.out.println("Nome: " + this.name + ", Idade: " + this.age);
	}

}

public class CloneExercicio {
	public static void main(String[] args) {
		PessoaOne martha = new PessoaOne("Martha", 25);
		int ageSample = 0;
		try {
			PessoaOne otherMartha = (PessoaOne) martha.clone();

			martha.exibirInfo();
			otherMartha.exibirInfo();

			ageSample = martha.age;

			System.out.println(martha);
			System.out.println(otherMartha);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(ageSample);

	}
}
