package br.edu.udc7_6;

public class TrianguloRetangulo implements FiguraGeometrica {

	private Ponto p1;
	private Ponto p2;
	private Ponto p3;

	public TrianguloRetangulo() {
		p1 = new Ponto();
		p2 = new Ponto();
		p3 = new Ponto();
	}

	public TrianguloRetangulo(Ponto p1, Ponto p2, Ponto p3) {
		this.p1 = p1.clone();
		this.p2 = p2.clone();
		this.p3 = p3.clone();
	}

	public TrianguloRetangulo clone() {
		return new TrianguloRetangulo(p1, p2, p3);
	}

	public float area() {
		return ( p1.distancia(p2) + p2.distancia(p3) / 2);
	}

	@Override
	public float comprimento() {// Base
		return p1.distancia(p2);
	}

	@Override
	public float altura() {
		return p2.distancia(p3);
	}

	@Override
	public float perimetro() {
		return ( p1.distancia(p2) + p2.distancia(p3) + p3.distancia(p1));
	}
}
