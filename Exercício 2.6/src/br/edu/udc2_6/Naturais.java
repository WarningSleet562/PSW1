package br.edu.udc2_6;

import java.util.Scanner;

public class Naturais {
	int x;
	int soma = 0;
	
	public Naturais () {
		
	}
	
	public Naturais (int x, int soma) {
		this.x = x;
		this.soma = soma;
	}
	
	public int SomaNaturais (int x, int soma) {
		if (x >= 0) {
			for (int i = 0; i < x; i++) {
				soma += (2 * i) + 1;
			}
		}
		else
			System.out.println("Entre com um número natural!");
		return soma;
	}
	
	public void Entrada () {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o número natural que deseja realizar a soma: ");
		x = sc.nextInt();
		
		Naturais i = new Naturais ();
		int resultado = i.SomaNaturais(x, soma);
		
		System.out.println("Soma dos naturais: " + resultado);
	}
}