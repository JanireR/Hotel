package es.deusto.ingenieria.sd.vueling.data.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class FlightDTO implements Serializable{
	String id_vuelo;
	String fecha;
	String hora;
	String origen;
	String destino;
	int plazas;
	
	
	public FlightDTO(String id_vuelo, String fecha, String hora, String origen, String destino, int plazas) {
		
		this.id_vuelo = id_vuelo;
		this.fecha = fecha;
		this.hora = hora;
		this.origen = origen;
		this.destino = destino;
		this.plazas = plazas;
	}


	public int getPlazas() {
		return plazas;
	}


	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	public String getId_vuelo() {
		return id_vuelo;
	}
	public void setId_vuelo(String id_vuelo) {
		this.id_vuelo = id_vuelo;
	}

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
}
