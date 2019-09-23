package br.edu.udc9_2;

public class Mamiferos extends Animal {
	
	String alimento;
	
	public Mamiferos(String nome, String cor, String ambiente, String alimento, float comprimento, int numerodepatas, float velocidade) {
		super(nome, cor, ambiente, comprimento, velocidade, numerodepatas);
		this.alimento = alimento;
	}
	
	public String getAlimento() {
		return alimento;
	}
	
	public void setAlimento(String alimento) {
		alimento = alimento;
	}
	
	void ImpressaoMamiferos() {
		System.out.println();
		super.Impressao();
		System.out.println("Alimento: " + alimento);
	}
}
