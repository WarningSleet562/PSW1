package br.edu.udc2_3_2;

import java.util.Scanner;

public class Inteiros {
	int x;
	int y;
	int soma;
	int diferenca;
	int quociente;
	int produto;
	
	public Inteiros () {
		
	}
	
	public Inteiros (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int Soma(int x, int y) {
		return x + y;
	}
	
	public int Difereca (int x, int y) {
		return x - y;
	}
	
	public int Produto (int x, int y) {
		return x * y;
	}
	
	public double Quociente (int x, int y) {
		if (x <= 0 || y <= 0)
			System.out.println("Não é possível dividir um número por 0");
		else if (x > y)	return ((double) x / (double) y);
		else return ((double) y / (double) x);
		return 0;
	}
	
	public void Entrada () {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o valor de X:");
		int x = sc.nextInt();
		
		System.out.println("Entre com o valor de Y:");
		int y = sc.nextInt();
		
		Inteiros i = new Inteiros ();
		double resultado = i.Soma(x, y);
		System.out.println ("Soma: " + resultado);
		
		resultado = i.Difereca(x, y);
		System.out.println ("Diferença: " + resultado);
		
		resultado = i.Produto(x, y);
		System.out.println ("Produto: " + resultado);
		
		resultado = i.Quociente(x, y);
		System.out.println ("Quociente: " + resultado);
	}
}
