package br.edu.udc13_7;

public class Hora {
	private int hora;
	private int minutos;
	private int segundos;

	public Hora() {
		setHora(0);
		setMinutos(0);
		setSegundos(0);
	}

	public void iniciaHora(int hora, int minutos, int segundos) {
		if (hora >= 0)
			this.hora = hora;
		else
			this.hora = 0;
		if (minutos >= 0)
			this.minutos = minutos;
		else
			this.minutos = 0;
		if (segundos >= 0)
			this.segundos = segundos;
		else
			this.segundos = 0;
	}
	
	public boolean eIgual(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hora other = (Hora) obj;
		if (hora != other.hora)
			return false;
		if (minutos != other.minutos)
			return false;
		if (segundos != other.segundos)
			return false;
		return true;
	}
	
	public boolean eAntes(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hora other = (Hora) obj;
		if (hora > other.hora)
			return true;
		if (minutos > other.minutos)
			return true;
		if (segundos > other.segundos)
			return true;
		return false;
	}

	public boolean eDepois(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hora other = (Hora) obj;
		if (hora < other.hora)
			return true;
		if (minutos < other.minutos)
			return true;
		if (segundos < other.segundos)
			return true;
		return false;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	
	public String mostraHoraAproximada() {
		return "Hora Aproximada\nHora:" + hora + "\nMinutos:" + minutos + "\nSegundos:" + segundos + "";
	}
}
