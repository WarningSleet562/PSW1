package br.edu.udc4_4_1;

import java.util.Scanner;

public class TrianguloFloyd {
	int n, i, j;
	
	public void ImprimeTriangulo() {
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.printf ("%d ", i * j);
			}
			System.out.printf("\n");
		}
	}
	
	public void Entrada() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de N: ");
		n = sc.nextInt();
		
		ImprimeTriangulo();
	}
}
