package es.deusto.ingenieria.sd.vueling.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import es.deusto.ingenieria.sd.vueling.data.dto.FlightDTO;
import es.deusto.ingenieria.sd.vueling.service.VuelingService;

public class VuelingFacade extends UnicastRemoteObject implements IVuelingFacade {
	
	@SuppressWarnings("unused")
	private static VuelingFacade instance;
	private static final long serialVersionUID = 1L;
	private VuelingService vService;

	public VuelingFacade(VuelingService server)throws RemoteException{
		super();
		this.vService = server;
	}


	@Override
	public List<FlightDTO> buscarVuelo(String origen, String destino, String fecha)throws RemoteException{
				
		return this.vService.buscarVuelo(origen, destino, fecha);
	}
	
	public void reservarVuelo (String vueloId, int plazas)throws RemoteException{
		this.vService.reservarVuelo(vueloId, plazas);
	}


	@Override
	public List<FlightDTO> buscarVueloOrigen(String origen) throws RemoteException {
		return this.vService.buscarVueloOrigen(origen);
	}
}
