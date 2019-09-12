package br.edu.udc2_3_6;

import java.util.Scanner;

public class Primo {
	int num;
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum(int num) {
		return this.num;
	}
	
	public String isPrimo() {
		int base = (int) Math.sqrt(num);
		
		for (int i = 2; i <= base; i++) {
			if (num != i)
				if (num % i == 0) return "N�MERO N�O PRIMO";
		}
		
		return "N�MERO PRIMO";
	}
	
	public void Entrada() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		num = sc.nextInt();
	}
}
