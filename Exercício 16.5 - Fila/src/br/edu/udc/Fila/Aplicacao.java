package br.edu.udc.Fila;

import br.edu.udc7_1.Ponto2D;

public class Aplicacao {

	public static void main (String [] args) {
		Fila<Ponto2D> fila = new Fila<Ponto2D>();

		fila.queue(new Ponto2D(1, 2));
		fila.queue(new Ponto2D(3, 4));
		fila.queue(new Ponto2D(5, 6));
		fila.queue(new Ponto2D(7, 8));
		fila.queue(new Ponto2D(9, 10));
		fila.queue(new Ponto2D(11, 12));
		fila.queue(new Ponto2D(13, 14));
		fila.queue(new Ponto2D(15, 16));

		System.out.println("Tamanho Fila: " + fila.getTamanho());
		
		fila.dequeue();
		fila.dequeue();
		fila.dequeue();
		
		System.out.println("Tamanho Fila: " + fila.getTamanho());
	}
}