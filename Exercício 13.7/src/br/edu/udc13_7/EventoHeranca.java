package br.edu.udc13_7;

public class EventoHeranca extends DataHora {
	String tipo;

	EventoHeranca(Data data, Hora hora) {
		super(data, hora);

		tipo = "Herança";
	}

	EventoHeranca() {
		super();
		
		tipo = "Herança";
	}

	public String getTipo() { 
		return tipo; 
	}
}
