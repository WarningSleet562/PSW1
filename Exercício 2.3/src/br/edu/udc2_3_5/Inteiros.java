package br.edu.udc2_3_5;

import java.util.Scanner;

public class Inteiros {
	int num;
	
	public void Entrada() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o número de cinco digitos: ");
		num = sc.nextInt();
		
		if (num > 9999 && num < 100000) {
			String str = String.valueOf(num);
			System.out.println(str.charAt(0) + "   " + str.charAt(1) + "   " + str.charAt(2) + "   " + str.charAt(3) + "   " + str.charAt(4));
		}
		else
			System.out.println("Entre com um número válido!");
	}
}
