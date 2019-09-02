package br.edu.udc7_1_1;

public class TesteForma {
	public static void main (String[] args) {
		Ponto2D p = new Ponto2D (2, 5);
		Linha l = new Linha (p, new Ponto2D(7, 15));
		Retangulo r = new Retangulo(new Ponto2D(4, 4), new Ponto2D(7, 7));
		
		System.out.printf("Centros %s\t%s\t%s\n", p.centro(), l.centro(), r.centro());
		System.out.printf("Perimetros %s\t%s\t%s\n", p.perimetro(), l.perimetro(), r.perimetro());
		System.out.printf("Areas %s\t%s\t%s\n", p.area(), l.area(), r.area());
		System.out.printf("Alturas %s\t%s\t%s\n", p.altura(), l.altura(), r.altura());
		System.out.printf("Larguras %s\t%s\t%s\n", p.largura(), l.largura(), r.largura());
		
		FormaGeometrica v[] = new FormaGeometrica[3];
		v[0] = p;
		v[1] = l;
		v[2] = r;
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Centro: %s\n", v[i].centro());
			System.out.printf("Perimetro: %f\n", v[i].perimetro());
			System.out.printf("Area: %f\n", v[i].area());
			System.out.printf("Largura: %f\n", v[i].largura());
			System.out.printf("Altura: %f\n", v[i].altura());
		}
	}
}
