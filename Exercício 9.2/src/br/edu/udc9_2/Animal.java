package br.edu.udc9_2;

public class Animal {
	String nome;
	String cor;
	String ambiente;
	float comprimento;
	float velocidade;
	int numerodepatas;
	
	public Animal(String nome, String cor, String ambiente, float comprimento, float velocidade, int numerodepatas) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.numerodepatas = numerodepatas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getAmbiente() {
		return ambiente;
	}
	
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public float getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	public float getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getNumerodepatas() {
		return numerodepatas;
	}
	
	public void setNumerodepatas(int numerodepatas) {
		this.numerodepatas = numerodepatas;
	}
	
	public void Impressao() {
		System.out.println("Nome: " + nome);
		System.out.println("Cor: " + cor);
		System.out.println("Ambiente: " + ambiente);
		System.out.println("Comprimento: " + comprimento);
		System.out.println("Velocidade: " + velocidade);
		System.out.println("Número de patas: " + numerodepatas);
	}
}
