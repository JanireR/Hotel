package es.deusto.ingenieria.sd.vueling.main;

import java.rmi.Naming;

import es.deusto.ingenieria.sd.vueling.remote.IVuelingFacade;
import es.deusto.ingenieria.sd.vueling.remote.VuelingFacade;
import es.deusto.ingenieria.sd.vueling.service.VuelingService;


public class Main {
	
	public static void main(String[]args){
		
		if (args.length<3){
			System.exit(0);
		}
		
		if(System.getSecurityManager()==null){
			System.setSecurityManager(new SecurityManager());
		}
		
		String name = "//" + args[0] + ":" + args[1] + "/" + args[2];

		try {
			VuelingService appService = VuelingService.getInstance();
			IVuelingFacade mainServer = new VuelingFacade(appService);
			Naming.rebind(name, mainServer);
			
			
			System.out.println("- ServiceFacade '" + name + "' active and waiting...");
		} catch (Exception e) {
			System.err.println("$ ServiceFacade exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

}