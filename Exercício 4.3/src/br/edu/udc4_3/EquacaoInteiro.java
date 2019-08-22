package br.edu.udc4_3;

import java.util.Scanner;

public class EquacaoInteiro {
	int num;
	
	public EquacaoInteiro () {
		
	}
	
	public EquacaoInteiro (int num) {
		this.num = num;
	}
	
	public void Operacao () {
		if (num > 1) {
			do {
				if (num % 2 == 0)
					num = num / 2;
				else
					num = ((2 * num) / 3) + 1;
				
				System.out.println("[" + num + "]");
			}while (num > 1);
		}
	}
	
	public void Entrada () {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o valor de x: ");
		num = sc.nextInt();
		
		Operacao();
	}
}
