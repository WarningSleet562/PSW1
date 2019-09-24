package br.edu.udc16_3;

public class Pilha {
	NoPilha topo;

	int tamanho;

	/* Construtores */

	public Pilha() {
		topo = null;
		tamanho = 0;
	}

	/* Getters e Setters */

	public int getTamanho() { return tamanho; }

	/* M�todos */

	public boolean isVazia() { 
		/* Verifica��o de exist�ncia de n�s na pilha */
		if (tamanho == 0) return true;
		else return false;
	}

	public boolean push(Object obj) { /* Inserir no topo da pilha */
		NoPilha n = new NoPilha(obj);

		/* Verificar se a pilha � vazia ou n�o */
		if (tamanho == 0) {
			topo = n;
			n.anterior = null;

			tamanho++;
			return true;
		}

		else {
			n.anterior = topo;
			topo = n;

			tamanho++;
			return true;
		}

	}

	public NoPilha pop() { /* Remover do topo da pilha */
		
		/* Verificar a exist�ncia de n�s no topo da pilha*/
		if (tamanho > 0) { 
			NoPilha n = topo;
			topo = n.anterior;

			tamanho--;
			return n;
		}

		/* Pilha vazia */
		else return null;
	}
}
