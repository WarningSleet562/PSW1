package br.edu.udc2_3_4;

import java.util.Scanner;

public class Inteiros {
	int x;
	int par;
	int impar;
	
	public Inteiros () {
		
	}
	
	public Inteiros (int x) {
		this.x = x;
	}
	
	public int ParImpar (int x) {
		if ((x % 2) == 0)
			System.out.println (x + " � par");
		else
			System.out.println (x + " � impar");
		return 0;
	}
	
	public void Entrada () {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o n�mero desejado: ");
		int x = sc.nextInt();
		
		ParImpar(x);
	}
}
