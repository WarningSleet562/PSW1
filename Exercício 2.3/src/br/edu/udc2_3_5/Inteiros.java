package br.edu.udc2_3_5;

import java.util.Scanner;

public class Inteiros {
	int num;
	int resto1;
	int resto2;
	int resto3;
	int resto4;
	int digito1;
	int digito2;
	int digito3;
	int digito4;
	int digito5;
	
	public void Entrada() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o número de cinco digitos: ");
		num = sc.nextInt();
		
		resto1 = num%10000;
		resto2 = num%1000;
		resto3 = num%100;
		resto4 = num%10;
		
		digito1 = num/10000;
		digito2 = resto1/1000;
		digito3 = resto2/100;
		digito4 = resto3/10;
		digito5 = resto4;
		
		System.out.println(digito1 + " " + digito2 + " " + digito3 + " " + digito4 + " " + digito5);	
	}
}
