package br.edu.udc3_1;

public class CincoDigitos {
	int cincoDigitos;
	
	public CincoDigitos (int cincoDigitos) {
		this.cincoDigitos = cincoDigitos;
	}
	
	public static String nomeDoDigito (int a) {
		switch (a) {
		case 0:
			return "zero";
		case 1:
			return "um";
		case 2:
			return "dois";
		case 3:
			return "três";
		case 4:
			return "quatro";
		case 5:
			return "cinco";
		case 6:
			return "seis";
		case 7:
			return "sete";
		case 8:
			return "oito";
		case 9:
			return "nove";
		}
		return "[!]";
	}
	
	public void Entrada () {
		String str = String.valueOf(this.cincoDigitos);
		
		if (str.length() != 5)
			System.out.println("Formato do número inválido!");
		else {
			int i;
			
			for (i = 0; i < 5; i++) {
				System.out.print(
						nomeDoDigito(
								Character.getNumericValue(
										str.charAt(i)
										)
								)
						);
				if (i < 4)
					System.out.print(", ");
				else
					System.out.print(".");
			}
		}
	}
}
