package edu.ifpr.exercicio1;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Livro livro1 = new Livro("A Hora da Estrela", "Clarisse Lispector", 104);
		Livro livro2 = new Livro("1984", "George Orwell", 254);
		
		livro1.exibirDetalhes();
		System.out.println("");
		livro2.exibirDetalhes();
	}
}
