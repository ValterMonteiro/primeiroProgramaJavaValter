package primeiroProgramaJavaValter;

import primeiroProgramaJavaValter.model.gato;

public class primeiroProgramaJavaValter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gato gato = new gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));*/
	}

}

class Livros{
	private String nome;
	private String npag;
}
