package rmiarea;

import java.rmi.*;
import java.rmi.server.*;

public class AreaClass extends UnicastRemoteObject implements Remote, AreaInterface{

	protected AreaClass() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double area (double radius) throws RemoteException{
		return 3.14*radius*radius;
	}
	
	

}