package br.edu.udc4_3_4;

import java.util.Scanner;

public class TrianguloFloyd {
	int i = 0;
	int qtd = 1;
	int num = 1;
	int n;
	
	public void ImprimeTriangulo() {
		if (n < 1)
			return;
		
		while (i < n) {
			int j;
			for (j = 0; j < qtd; j++) {
				System.out.printf("%d \n", num);
				num++;
			}
			System.out.printf("\n");
			qtd++;
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
