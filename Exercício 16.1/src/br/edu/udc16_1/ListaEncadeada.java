package br.edu.udc16_1;

public class ListaEncadeada {
	private NoLista inicio;
	private NoLista fim;

	private int tamanho;

	public ListaEncadeada() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void inserirInicio(Object obj) { // Insere no in�cio
		NoLista novo = new NoLista();
		
		novo.dado = obj;
		novo.proximo = inicio;
		novo.anterior = null;

		if (inicio == null) { // Lista vazia
			inicio = novo;
			fim = novo;
		} else { // Novo in�cio
			inicio.anterior = novo;
			inicio = novo;
		}
		tamanho++;
	}

	public void InserirMeio(Object obj, int pos) { // Insere em qualquer posi��o
		if (pos < 1 || pos > tamanho + 1)
			return;

		NoLista novo = new NoLista();
		
		
		NoLista aux = inicio;
		int contador = 1;

		novo.dado = obj;
		novo.proximo = null;
		novo.anterior = null;

		while (contador < pos) {
			aux = aux.proximo;
			contador++;
		}

		novo.anterior = aux.anterior;
		novo.proximo = aux;

		aux.anterior.proximo = novo;
		aux.anterior = novo;

		tamanho++;
	}

	public void inserirFim(Object obj) { // Insere no fim
		NoLista novo = new NoLista();

		novo.dado = obj;
		novo.proximo = null;
		novo.anterior = fim;

		if (fim != null)// Insere no fim;
			fim.proximo = novo;

		fim = novo;

		if (inicio == null) // Lista vazia
			inicio = novo;

		tamanho++;
	}

	public void remover(int pos) { // Remove item por posi��o

		if(tamanho == 1 && pos == 0) { // Remover o �nico elemento da lista
			inicio = null;
			fim = null;
			tamanho--;
			return;
		}
		
		if(pos == 0) { // Remover o in�cio
			inicio = inicio.proximo;
			inicio.anterior = null;
			tamanho--;
			return;
		}
		
		if(pos == tamanho-1) { // Remover o �ltimo elemento
			fim = fim.anterior;
			fim.proximo = null;
			tamanho--;
			return;
		}
		
		if(pos > 1 && pos <tamanho-1) {
		
		NoLista iterador = inicio;
		int contador = 1;

		while (contador < pos) {
			iterador = iterador.proximo;
			contador++;
		}

		iterador.anterior.proximo = iterador.proximo;
		iterador.proximo.anterior = iterador.anterior;
		tamanho--;
		}
	}

	public boolean remover(Object obj) {
		
		NoLista iterador = inicio;
		boolean removido = false;

		while (iterador != null) {
			
			if(iterador.dado.equals(obj)) {
				if(tamanho == 1) { // �nico elemento
					inicio = null;
					fim = null;
				}
				else if(iterador == inicio) { // Primeiro elemento
					inicio = inicio.proximo;
					inicio.anterior = null;
				}
				else if(iterador == fim) { // �ltimo elemento
					fim = fim.anterior;
					fim.proximo = null;
				}
				else {
					iterador.anterior.proximo = iterador.proximo;
					iterador.proximo.anterior = iterador.anterior;
				}
				removido = true;
				tamanho --;
		}
			iterador = iterador.proximo;
	}
		return removido;	
}

	public Object pesquisar(int pos) {
		NoLista auxiliar = inicio;
		int cont = 1;

		if (tamanho == 0)
			return null;

		if (pos > tamanho)
			return null;

		while (cont < pos) {
			auxiliar = auxiliar.proximo;
			cont++;
		}

		return auxiliar.dado;
	}

}
