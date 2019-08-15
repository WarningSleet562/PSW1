package br.edu.udc2_3_1;

import java.util.Scanner;

public class Inteiros {
	int x;
	int y;
	int z;
	int produto;
	
	public Inteiros (){
		
	}
	
	public Inteiros (int x, int y, int z){
		if (!Teste(x, y, z))
			return;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int Produto (int x, int y, int z){
		return x * y * z;
	}

	static boolean Teste (int x, int y, int z){
		if (x > 0 && y > 0 && z > 0)
			return true;
		return false;
	}
	
	public void Entrada() {
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