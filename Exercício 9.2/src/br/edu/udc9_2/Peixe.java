package br.edu.udc9_2;

public class Peixe extends Animal {
	
	private String caracteristica;
	
	public Peixe(String nome, String cor, String ambiente, String caracteristica, float comprimento, float velocidade, int numerodepatas) {
		super(nome, cor, ambiente, comprimento, velocidade, numerodepatas);
		this.caracteristica = caracteristica;
	}
	
	public String getCaracteristica() {
		return caracteristica;
	}
	
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void ImpressaoPeixe() {
		System.out.println();
		super.Impressao();
		System.out.println("Característica: " + caracteristica);
	}
}
