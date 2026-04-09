package edu.ifpr.exercicio2;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Leo", "Shih Tzu", 1);
		Cachorro cachorro2 = new Cachorro("Leonora", "Labrador", 4);
		Cachorro cachorro3 = new Cachorro("José", "Golden Retriver", 10);
		
		cachorro1.carteirinhaCachorro();
		cachorro1.latir();
		
		System.out.println("-------------------------------");
		
		cachorro2.carteirinhaCachorro();
		cachorro2.latir();
		
		System.out.println("-------------------------------");

		cachorro3.carteirinhaCachorro();
		cachorro3.latir();
	}
}
