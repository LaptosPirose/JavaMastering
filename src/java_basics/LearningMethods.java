package java_basics;

public class LearningMethods {

	public static void main(String[] args) {
		/**
		* System.out.println("Learning Methods");
		* MyUtils.printSomeJunk("Hello World!");
		* MyUtils.printSomeJunk(150);
		* System.out.println(MyUtils.sum2Numbers(120, 200));
		*/
		
		Exemplo exemplo = new Exemplo("livro", 1998); 
		
		System.out.println(exemplo.getNome());
		System.out.println(exemplo.getAno());
		System.out.println(exemplo.returnAll());
		System.out.println(Exemplo.returnAll());
	}
}