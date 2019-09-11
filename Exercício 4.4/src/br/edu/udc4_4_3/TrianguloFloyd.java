package br.edu.udc4_4_3;

import java.util.Scanner;

public class TrianguloFloyd {
	int n, i, j;
	
	public void ImprimeTriangulo() {
		i = 1;
		
		do {
			j = 1;
			
			do {
				System.out.printf(j*i + " ");
				j++;
			}while(j <= i);
			
			System.out.printf("\n");
			i++;
		}while(i <= n);
	}
	
	public void Entrada() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de N: ");
		n = sc.nextInt();
		
		ImprimeTriangulo();
	}
}
