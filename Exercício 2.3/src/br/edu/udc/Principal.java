package br.edu.udc;

import java.util.Scanner;

public class Principal {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Entre com o valor de X: ");
		int x = sc.nextInt();
		
		System.out.println ("Entre com o valor de Y: ");
		int y = sc.nextInt();
		
		System.out.println ("Entre com o valor de Z: ");
		int z = sc.nextInt();
		
		Inteiros i = new Inteiros ();
		int resultado = i.Produto(x, y, z);
		
		System.out.println ("Produto: " + resultado);
	}
}
