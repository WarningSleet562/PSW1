package br.edu.udc9_2;

public class PrincipalTeste {
	
		public static void main(String[] args) {
			
			Mamiferos a = new Mamiferos("Camelo", "Amarelo", "Terra", null, 150, 4, 2);
			a.ImpressaoMamiferos();
			
			Peixe b = new Peixe("Tubar�o", "Cinzento", "Mar", "Barbatanas e Cauda", 300, 0, 2);
			b.ImpressaoPeixe();
			
			Mamiferos c = new Mamiferos("Urso do Canad�", "Vermelho", "Terra", "Mel", 180, 4, 05);
			c.ImpressaoMamiferos();
		}
}
