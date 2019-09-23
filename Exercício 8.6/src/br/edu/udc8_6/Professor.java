package br.edu.udc8_6;

public class Professor extends Pessoa {
	
	private String disciplina;
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		disciplina = disciplina;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Professor disciplina: " + disciplina;
	}
}
