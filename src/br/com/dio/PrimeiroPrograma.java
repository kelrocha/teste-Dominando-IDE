package br.com.dio;

import br.com.dio.model.gato;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		
		gato gato = new gato ();
		Livros Livros = new Livros();
		
		System.out.println(gato);
		System.out.println(Livros);
			
		/*int a = 2;
		int b = 2;
		System.out.println("Hello World " + (a+b));*/
	}
	

	}

class Livros {
	private String nome;
	private String npag;
}
