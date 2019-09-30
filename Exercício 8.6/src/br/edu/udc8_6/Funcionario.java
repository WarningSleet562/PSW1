package br.edu.udc8_6;

public class Funcionario extends Pessoa {
	
	private String num_registro;
	private float salario;
	private String data_admissao;
	
	public String getNum_registro() {
		return num_registro;
	}
	
	public void setNum_registro(String num_registro) {
		this.num_registro = num_registro;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String getData_admissao() {
		return data_admissao;
	}
	
	public void setData_admissao(String data_admissao) {
		this.data_admissao = data_admissao;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Funcionário num_registro:" + num_registro + ", salário:" + salario + ", data_admissao:" + data_admissao;
	}
}