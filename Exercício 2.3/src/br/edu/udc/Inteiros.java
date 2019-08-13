package br.edu.udc;

public class Inteiros {
	int x;
	int y;
	int z;
	int produto;
	
	public Inteiros (){
		
	}
	
	public Inteiros (int x, int y, int z){
		if (!Teste(x, y, z))
			return;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int Produto (int x, int y, int z){
		return x * y * z;
	}

	static boolean Teste (int x, int y, int z){
		if (x > 0 && y > 0 && z > 0)
			return true;
		return false;
	}
}