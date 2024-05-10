package rmiarea;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface AreaInterface extends Remote{
	
	public double area(double radius) throws RemoteException;
}