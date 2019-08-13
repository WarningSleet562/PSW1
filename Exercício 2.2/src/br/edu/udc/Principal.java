package br.edu.udc;

import java.util.Scanner;

public class Principal {
	
	public static void main (String[] args) {
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
