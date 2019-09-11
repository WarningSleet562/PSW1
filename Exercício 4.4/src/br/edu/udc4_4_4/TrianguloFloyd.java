package br.edu.udc4_4_4;

import java.util.Scanner;

public class TrianguloFloyd {
	int n, i, j;
	
	public void ImprimeTriangulo() {
		for (i = 1; i <= n; i++) {
			j = 1;
			
			do {
				System.out.printf(j*i + " ");
				j++;
			}while(j <= i);
		}
	}
	
	public void Entrada() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de N: ");
		n = sc.nextInt();
		
		ImprimeTriangulo();
	}
}
