package br.edu.udc3_3;

import java.util.Scanner;

public class Triangulo {
	int ladoA;
	int ladoB;
	int ladoC;
	
	public Triangulo () {
		
	}
	
	public Triangulo (int ladoA, int ladoB, int ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
	public int VerificaTriangulo (int ladoA, int ladoB, int ladoC) {
		if (ladoA == ladoB && ladoA == ladoC)
			System.out.println ("Equilátero");
		else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
			System.out.println ("Isósceles");
		else
			System.out.println ("Escaleno");
		return 0;
	}
	
	public void Entrada() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o valor do lado A: ");
		ladoA = sc.nextInt();
		
		System.out.println("Entre com o valor do lado B: ");
		ladoB = sc.nextInt();
		
		System.out.println("Entre com o valor do lado C: ");
		ladoC = sc.nextInt();
		
		Triangulo i = new Triangulo();
		int resultado = i.VerificaTriangulo(ladoA, ladoB, ladoC);
	}
}
