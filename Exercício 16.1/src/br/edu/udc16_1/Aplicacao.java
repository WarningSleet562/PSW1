package br.edu.udc16_1;

public class Aplicacao {

	public static void main (String [] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		Ponto2D ponto = new Ponto2D(5, 5);
		
		lista.inserir(ponto, 0);
		
		Ponto2D ponto2 = new Ponto2D(3, 6);
		
		lista.inserir(ponto2, -1);
		
		Ponto2D ponto3 = new Ponto2D(1, 4);
		
		lista.inserir(ponto3, 1);
		
		NoLista it = lista.inicio;
		
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(it.obj.toString());
			it = it.proximo;
		}
		
		lista.remover(ponto2);
		
		System.out.println("---");
		
		it = lista.inicio;
		
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(it.obj.toString());
			it = it.proximo;
		}
	}
}
