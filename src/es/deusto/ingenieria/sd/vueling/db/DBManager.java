package es.deusto.ingenieria.sd.vueling.db;

import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.sd.vueling.data.Flight;

public class DBManager {
	
	public static DBManager instance = new DBManager();
	private List<Flight> listaVuelos = new ArrayList<>();
	
	public static DBManager getInstance(){
		return instance;
	}
	
	public DBManager(){
		Flight vuelo1 = new Flight("VU635", "19/02/18", "09:00", "BILBAO", "BARCELONA", 150);
		Flight vuelo2 = new Flight("VU621", "23/03/18", "10:20", "MADRID", "BARCELONA", 180);
		Flight vuelo3 = new Flight("VU678", "15/04/18", "18:30", "BARCELONA", "BILBAO", 140);
		Flight vuelo4 = new Flight("VU654", "25/05/18", "20:50", "BILBAO", "MADRID", 200);
		Flight vuelo5 = new Flight("VU635", "28/06/18", "18:40", "SEVILLA", "BILBAO", 180);
		listaVuelos.add(vuelo1);
		listaVuelos.add(vuelo2);
		listaVuelos.add(vuelo3);
		listaVuelos.add(vuelo4);
		listaVuelos.add(vuelo5);
	}
	
	public List<Flight> getListaVuelos(String o, String d, String f){
		List<Flight> lista =new ArrayList<>();
		for(int i= 0; i<listaVuelos.size();i++){
			if(listaVuelos.get(i).getOrigen().equals(o))
				if(listaVuelos.get(i).getDestino().equals(d))
					if(listaVuelos.get(i).getFecha().equals(f))
						lista.add(listaVuelos.get(i));
		}
		
		return lista;
	}
	
	public List<Flight> getListaEntera(){		
		
		return listaVuelos;
	}
	
	public void setListaVuelos(List<Flight> nuevaLista){
		this.listaVuelos = nuevaLista;
	}

	public List<Flight> getListaVuelosOrigen(String ori) {
		List<Flight> lista =new ArrayList<>();
		for(int i= 0; i<listaVuelos.size();i++){
			if(listaVuelos.get(i).getOrigen().equals(ori))
				lista.add(listaVuelos.get(i));
		}
		return lista;
	}
}

