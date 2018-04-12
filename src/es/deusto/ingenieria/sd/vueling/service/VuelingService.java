package es.deusto.ingenieria.sd.vueling.service;

import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.sd.vueling.data.Flight;
import es.deusto.ingenieria.sd.vueling.data.dto.FlightAssembler;
import es.deusto.ingenieria.sd.vueling.data.dto.FlightDTO;
import es.deusto.ingenieria.sd.vueling.db.DBManager;

public class VuelingService {

	public static VuelingService instance = null;
	
	public static VuelingService getInstance(){
		if( instance == null){
			instance = new VuelingService();
		}
		return instance;
	}
	
	public VuelingService(){}
	
	public synchronized List<FlightDTO> buscarVuelo(String origen, String destino, String fecha){
		//pasar a DTO solo aquellos que nos interesa
		System.out.println("Aqui llegan bien->"+origen+ " - " +destino+" - " +fecha);
		List<FlightDTO> comodin2 = new ArrayList<>();
		List<Flight> comodin1 = new ArrayList<>();
		comodin1 = DBManager.getInstance().getListaVuelos(origen,destino, fecha);
		FlightAssembler as = new FlightAssembler();
		comodin2 = as.assemble(comodin1);
	
		System.out.println(comodin2);
		return comodin2;
	}
	
	public int reservarVuelo(String vueloId , int plazasReserva){
		List<Flight> comodin1 = new ArrayList<>();
		comodin1 = DBManager.getInstance().getListaEntera();
		int i = 0;		
		while(!(comodin1.get(i).getId_vuelo().equals(vueloId))){
			i++;
		}
		int plazasVuelo = comodin1.get(i).getPlazas()-plazasReserva;
		comodin1.get(i).setPlazas(plazasVuelo);
		DBManager.getInstance().setListaVuelos(comodin1);
		return plazasVuelo;
	}

	public synchronized List<FlightDTO> buscarVueloOrigen(String origen) {
		//pasar a DTO solo aquellos que nos interesa
		System.out.println("Aqui llegan bien->"+origen);
		List<FlightDTO> comodin2 = new ArrayList<>();
		List<Flight> comodin1 = new ArrayList<>();
		comodin1 = DBManager.getInstance().getListaVuelosOrigen(origen);
		FlightAssembler as = new FlightAssembler();
		comodin2 = as.assemble(comodin1);
	
		System.out.println(comodin2);
		return comodin2;
	}
}
