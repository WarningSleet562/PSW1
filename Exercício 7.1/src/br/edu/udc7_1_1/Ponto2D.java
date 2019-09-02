package br.edu.udc7_1_1;

public class Ponto2D extends FormaGeometrica {
	private int x;
	private int y;
	
	public Ponto2D() {
		x = 0;
		y = 0;
	}
	
	public Ponto2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String quadrante() {
		if (x > 0 && y > 0)
			return "1° Quadrante";
		if (x < 0 && y > 0)
			return "2° Quadrante";
		if (x < 0 && y < 0)
			return "3° Quadrante";
		if (x > 0 && y < 0)
			return "4° Quadrante";
		return "Origem";
	}
	
	public float distancia(Ponto2D pt) {
		return (float) Math.sqrt((x-pt.x)*(x-pt.x) + (y-pt.y)*(y-pt.y));
	}
	
	public Ponto2D centro() {
		return new Ponto2D(x, y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!obj.getClass().equals(Ponto2D.class))
			return false;
		if (obj == this)
			return true;
		
		if (this.x != ((Ponto2D)obj).x)
			return false;
		if (this.y != ((Ponto2D)obj).y)
			return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "(" + x + "; " + y + ")";
	}

	@Override
	public float perimetro() {
		return 0;
	}

	@Override
	public float area() {
		return 0;
	}

	@Override
	public float largura() {
		return 0;
	}

	@Override
	public float altura() {
		return 0;
	}
}