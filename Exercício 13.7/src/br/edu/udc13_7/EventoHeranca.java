package br.edu.udc13_7;

public class EventoHeranca extends DataHora {
	String tipo;

	EventoHeranca(Data data, Hora hora) {
		super(data, hora);

		tipo = "Heran�a";
	}

	EventoHeranca() {
		super();
		
		tipo = "Heran�a";
	}

	public String getTipo() { 
		return tipo; 
	}
}
