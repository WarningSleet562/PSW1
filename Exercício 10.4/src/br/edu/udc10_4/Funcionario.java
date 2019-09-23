package br.edu.udc10_4;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private String departamento;
	private String data_admissao;
	private String RG;
	private String CPF;
	private float salario;
	
	public Funcionario(String nome, String sobrenome, String departamento, String data_admissao, String rG, String cPF, float salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.departamento = departamento;
		this.data_admissao = data_admissao;
		RG = rG;
		CPF = cPF;
		setSalario(salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(String data_admissao) {
		this.data_admissao = data_admissao;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		if (salario <= 0)
			salario = 0;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "\nFuncionario: \nnome: " + nome + ", \nsobrenome: " + sobrenome + ", \ndepartamento: " + departamento
				+ ", \ndata_admissao: " + data_admissao + ", \nRG: " + RG + ", \nCPF: " + CPF + ", \nsalario: " + salario;
	}
	
	public void RecebeAumento(double percentual) {
		setSalario((float) (salario+(salario*percentual)));
	}
	
	public float CalculaGanhoAnual() {
		return getSalario()*13;
	}
}