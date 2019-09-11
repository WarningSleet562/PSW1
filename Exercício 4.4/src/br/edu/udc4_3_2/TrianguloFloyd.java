package br.edu.udc4_3_2;

import java.util.Scanner;

public class TrianguloFloyd {
	int n, i, j;
	
	public void ImprimeTriangulo() {
		i = 1;
		
		while (i <= n) {
			j = 1;
			while (j <= i) {
				System.out.printf(j*i + " ");
				j++;
			}
			System.out.printf("\n");
			i++;
		}
	}
	
	public void Entrada() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de N: ");
		n = sc.nextInt();
		
		ImprimeTriangulo();
	}
}
