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
	
	/* Métodos */
	
	public boolean isVazia() {
		/* Verificação de existência de nós na lista */
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
		
		/* Primeira inserção */
		if (tamanho == 0) {
			
			inicio = n;
			fim = n;
			
			tamanho++;
			return true;
		}
		
		/* Inserção no início da lista, parâmetro pos negativo ou zero */
		else if (pos <= 0) {
			
			n.proximo = inicio;
			inicio.anterior = n;
			inicio = n;
			
			tamanho++;
			return true;
		}
		
		/* Inserção no fim da lista, parâmetro pos superior ou igual ao tamanho */
		else if (pos >= tamanho) {
			
			n.anterior = fim;
			fim.proximo = n;
			fim = n;
			
			tamanho++;
			return true;
		}
		
		/* Inserção na posição desejada */
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
		
		/* Busca pela posição do objeto específico */
		else {
			NoLista it = inicio;
			boolean flag = false; /* Variável para controle da remoção */
			
			for (int i = 0; i < tamanho; i++) {
				
				if (obj.equals(it.obj)) {
					
					/* Remoção em lista unitária */
					if (tamanho == 1) {
						inicio = null;
						fim = null;
					}
					
					/* Remoção do primeiro elemento */
					else if (it == inicio) {
						inicio = inicio.proximo;
						inicio.anterior = null;
					}
					
					/* Remoção do último elemento */
					else if (it == fim) {
						fim = fim.anterior;
						fim.proximo = null;
					}
					
					/* Remoção específica */
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
		
		/* Remoção em lista vazia */
		if (tamanho == 0)
			return false;
		
		/* Remoção em lista unitária */
		else if (tamanho == 1 && pos <= 0) {
			inicio = null;
			fim = null;
			
			tamanho--;
			return true;
		}
		
		/* Remoção do primeiro elemento */
		else if (pos <= 0) {
			inicio = inicio.proximo;
			inicio.anterior = null;
			
			tamanho--;
			return true;
		}
		
		/* Remoção do último elemento */
		else if (pos >= tamanho-1) {
			fim = fim.anterior;
			fim.proximo = null;
			
			tamanho--;
			return true;
		}
		
		/* Busca pela posição específica */
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
