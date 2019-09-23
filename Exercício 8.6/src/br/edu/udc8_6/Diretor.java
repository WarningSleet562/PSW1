package br.edu.udc8_6;

public class Diretor extends Pessoa {
	
	private String ano_mandato;
	
	public String getAno_mandato() {
		return ano_mandato;
	}
	
	public void setAno_mandato(String ano_mandato) {
		ano_mandato = ano_mandato;
	}

	@Override
	public String toString() {
		return super.toString() + "Diretor ano_mandato: " + ano_mandato;
	}
}