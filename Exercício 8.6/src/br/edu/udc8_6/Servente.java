package br.edu.udc8_6;

public class Servente extends Pessoa {

	private String setor;
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Servente setor: " + setor;
	}
}
