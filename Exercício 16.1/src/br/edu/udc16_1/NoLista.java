package br.edu.udc16_1;

public class NoLista {
	NoLista proximo;
	NoLista anterior;
	Object obj;
	
	/* Construtores */
	
	NoLista(){
		this.proximo = null;
		this.anterior = null;
		this.obj = null;
	}
	
	NoLista(Object obj){
		this.proximo = null;
		this.anterior = null;
		this.obj = null;
	}
	
	NoLista(NoLista proximo, NoLista anterior, Object obj){
		this.proximo = proximo;
		this.anterior = anterior;
		this.obj = obj;
	}
}