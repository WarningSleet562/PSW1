package br.edu.udc13_7;

public class EventoDelegacao {
	DataHora data_hora;
	String tipo;

	EventoDelegacao(Data data, Hora hora) {
		this.data_hora = new DataHora(data, hora);

		tipo = "Delega��o/Composi��o";
	}

	EventoDelegacao() {
		this.data_hora = new DataHora();

		tipo = "Delega��o/Composi��o";
	}

	public String getTipo() { 
		return tipo; 
	}
}
