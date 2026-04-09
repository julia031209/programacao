package edu.ifpr.exercicio4;

public class Heroi {

	private String nome;
	private int nivel, forca, vida, vidaMaxima;
	
	public Heroi(String nome, int forca, int nivel, int vida, int vidaMaxima) {
		this.nome = nome;
		this.forca = forca;
		this.nivel = nivel;
		this.vida = vida;
		this.vidaMaxima = vidaMaxima;
	}
	
	public void receberDano(int dano) {
		if(vida > 0) {
			vida -= dano;
		}
		else {
			System.err.println("Sua vida está em " + vida + " não foi possível receber o dano");
		}
	}
	
	public void adicionarVida(int cura) {
		if(vida < 100) {
			vida += cura;
		}
		else {
			System.err.println("Sua vida está em " + vida + ", não foi possível adicionar pois o máximo de cura é 100");
		}
	}
	
	public void subirNivel() {
		nivel++;
	}
}
