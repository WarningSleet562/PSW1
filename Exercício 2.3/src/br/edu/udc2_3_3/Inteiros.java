package br.edu.udc2_3_3;

import java.util.Scanner;

public class Inteiros {
	int x;
	int y;
	int z;
	int media;
	int maiorn;
	int menorn;
	
	public Inteiros () {
		
	}
	
	public Inteiros (int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int Soma (int x, int y, int z) {
		return x + y + z;
	}
	
	public int Produto (int x, int y, int z) {
		return x * y * z;
	}
	
	public int Media (int x, int y, int z) {
		return media = (x + y + z) / 3;
	}
	
	public int MaiorNumero (int x, int y, int z) {
		if (x > y && x > z)
			return maiorn = x;
		else if (y > z)
			return maiorn = y;
		else
			return maiorn = z;
	}
	
	public int MenorNumero (int x, int y, int z) {
		if (x < y && x < z)
			return menorn = x;
		else if (y < z)
			return menorn = y;
		else 
			return menorn = z;
	}
	
	public void Entrada () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de X: ");
		int x = sc.nextInt();
		
		System.out.println("Entre com o valor de Y: ");
		int y = sc.nextInt();
		
		System.out.println("Entre com o valor de Z: ");
		int z = sc.nextInt();
		
		Inteiros i = new Inteiros();
		int resultado = i.Soma(x, y, z);
		System.out.println("Soma: " + resultado);
		
		resultado = i.Produto(x, y, z);
		System.out.println("Produto: " + resultado);
		
		resultado = i.Media(x, y, z);
		System.out.println("Media: " + resultado);
		
		resultado = i.MaiorNumero(x, y, z);
		System.out.println("Maior número: " + resultado);
		
		resultado = i.MenorNumero(x, y, z);
		System.out.println("Menor número: " + resultado);
	}
}
