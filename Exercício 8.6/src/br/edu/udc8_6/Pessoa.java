package br.edu.udc8_6;

public class Pessoa {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		nome = nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa nome: " + nome;
	}
}
