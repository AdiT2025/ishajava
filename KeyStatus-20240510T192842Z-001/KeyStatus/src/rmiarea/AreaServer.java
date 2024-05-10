package rmiarea;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class AreaServer {

	public static void main(String[] args) throws Exception{
		
		Registry reg = LocateRegistry.createRegistry(2000);
		AreaInterface obj = new AreaClass();
		reg.bind("ABC", obj);

	}

}