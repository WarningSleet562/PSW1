package br.edu.udc3_4;

import java.util.Scanner;

public class ImpostoRenda {
	float sal;
	float novosal;
	
	public void setSalario (float sal) {
		this.sal = sal;
	}
	
	public int VerificaSalario (){
		if (sal <= 2487.00)
			return 0;
		else if (sal > 2487.00 && sal <= 3873.00)
			return 13;
		else if (sal > 3873.00 && sal <= 4733.00)
			return 17;
		else if (sal > 4733.00 && sal <= 5827.00)
			return 22;
		
		return 27;
	}
	
	public void CalculaImposto () {
		float percentual = VerificaSalario() / (float)100;
		float imposto = percentual * sal * 12;
		System.out.printf("Percentual de imposto: %.2f \n", percentual);
		System.out.printf("Valor anual de imposto: %.2f \n", imposto);
	}
	
	public void Entrada () {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o salário: ");
		sal = sc.nextInt();
		
		CalculaImposto();
	}
}
