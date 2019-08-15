package br.edu.udc;

import java.util.Scanner;

public class Valores {
	int x;
	int y;
	static int soma;

	public int Soma(int x, int y){
		return x + y;
	}
	
	public int Diferenca(int x, int y) {
		return x - y;
	}
	
	public void Entrada () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de X: ");
		int x = sc.nextInt();
		
		System.out.println("Entre com o valor de Y: ");
		int y = sc.nextInt();
		
		Valores v = new Valores();
		int resultado = v.Soma(x, y);
		
		System.out.println("Soma: " + resultado);
		
		resultado = v.Diferenca(x, y);
		System.out.println("Diferença: " + resultado);
	}
}