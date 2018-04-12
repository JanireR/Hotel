package es.deusto.ingenieria.sd.vueling.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import es.deusto.ingenieria.sd.vueling.data.dto.FlightDTO;

public interface IVuelingFacade extends Remote {

	public List<FlightDTO> buscarVuelo(String origen, String destino, String fecha)throws RemoteException;
	public void reservarVuelo(String vueloId, int plazas)throws RemoteException;
	public List<FlightDTO> buscarVueloOrigen(String origen)throws RemoteException;

}