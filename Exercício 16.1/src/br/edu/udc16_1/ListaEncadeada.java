package br.edu.udc16_1;

public class ListaEncadeada {
	NoLista inicio;
	NoLista fim;
	
	int tamanho;
	
	/* Construtores */
	
	public ListaEncadeada() {
		inicio = null;
		fim = null;
		
		tamanho = 0;
	}
	
	/* Getters e Setters */
	
	public int getTamanho() {
		return tamanho;
	}
	
	/* M�todos */
	
	public boolean isVazia() {
		/* Verifica��o de exist�ncia de n�s na lista */
		if (tamanho == 0) return true;
		else return false;
	}
	
	public IteradorAbstrato getIteradorInicio() {
		Iterador it = new Iterador(inicio);
		return it;
	}
	
	public IteradorAbstrator getIteradorFim() {
		return new Iterador(fim);
	}
	
	public boolean inserir(Object obj, int pos) {
		
		NoLista n = new NoLista(obj);
		
		/* Primeira inser��o */
		if (tamanho == 0) {
			
			inicio = n;
			fim = n;
			
			tamanho++;
			return true;
		}
		
		/* Inser��o no in�cio da lista, par�metro pos negativo ou zero */
		else if (pos <= 0) {
			
			n.proximo = inicio;
			inicio.anterior = n;
			inicio = n;
			
			tamanho++;
			return true;
		}
		
		/* Inser��o no fim da lista, par�metro pos superior ou igual ao tamanho */
		else if (pos >= tamanho) {
			
			n.anterior = fim;
			fim.proximo = n;
			fim = n;
			
			tamanho++;
			return true;
		}
		
		/* Inser��o na posi��o desejada */
		else if(tamanho > pos && pos > 0) {
			
			NoLista it = inicio;
			
			for (int i = 0; i < pos; i++) 
				it = it.proximo;
			
			n.proximo = it;
			n.anterior = it.anterior;
			it.anterior.proximo = n;
			it.anterior = n;
			
			tamanho++;
			return true;
		}
		
		else return false;
	}
	
	public boolean remover(Object obj) {
		
		/* Remover em lista vazia */
		if (tamanho == 0)
			return false;
		
		/* Busca pela posi��o do objeto espec�fico */
		else {
			NoLista it = inicio;
			boolean flag = false; /* Vari�vel para controle da remo��o */
			
			for (int i = 0; i < tamanho; i++) {
				
				if (obj.equals(it.obj)) {
					
					/* Remo��o em lista unit�ria */
					if (tamanho == 1) {
						inicio = null;
						fim = null;
					}
					
					/* Remo��o do primeiro elemento */
					else if (it == inicio) {
						inicio = inicio.proximo;
						inicio.anterior = null;
					}
					
					/* Remo��o do �ltimo elemento */
					else if (it == fim) {
						fim = fim.anterior;
						fim.proximo = null;
					}
					
					/* Remo��o espec�fica */
					else {
						it.proximo.anterior = it.anterior;
						it.anterior.proximo = it.proximo;
					}
					
					tamanho--;
					flag = true;
				}
			
				it = it.proximo;
			}
		}
		return flag;
	}
	
	public boolean remover(int pos) {
		
		/* Remo��o em lista vazia */
		if (tamanho == 0)
			return false;
		
		/* Remo��o em lista unit�ria */
		else if (tamanho == 1 && pos <= 0) {
			inicio = null;
			fim = null;
			
			tamanho--;
			return true;
		}
		
		/* Remo��o do primeiro elemento */
		else if (pos <= 0) {
			inicio = inicio.proximo;
			inicio.anterior = null;
			
			tamanho--;
			return true;
		}
		
		/* Remo��o do �ltimo elemento */
		else if (pos >= tamanho-1) {
			fim = fim.anterior;
			fim.proximo = null;
			
			tamanho--;
			return true;
		}
		
		/* Busca pela posi��o espec�fica */
		else if (pos < tamanho-1 && pos > 0) {
			NoLista it = inicio;
			
			for (int i = 0; i < pos; i++)
				it = it.proximo;
			
			it.proximo.anterior = it.anterior;
			it.anterior.proximo = it.proximo;
			
			tamanho--;
			return true;
		}
		
		else return false;
	}
	
	public Object pesquisar(int pos) {
		NoLista it = inicio;
		
		for (int i = 0; i < pos; i++)
			it = it.proximo;
		
		return it.obj;
	}
}
