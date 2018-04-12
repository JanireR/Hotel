package es.deusto.ingenieria.sd.vueling.data.dto;

import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.sd.vueling.data.Flight;

public class FlightAssembler {
	
	public List<FlightDTO> assemble(List<Flight> vuelos){
		List<FlightDTO> vuelosDTO = new ArrayList<>();
		
		for(Flight t: vuelos){
			vuelosDTO.add(new FlightDTO(t.getId_vuelo(), t.getFecha(),t.getHora(),t.getOrigen(),t.getDestino(), t.getPlazas()));
		}
		
		System.out.println("* Assembling Vuelos...");
		
		return vuelosDTO;
		
	}
}
