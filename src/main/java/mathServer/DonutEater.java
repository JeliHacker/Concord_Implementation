package mathServer;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DonutEater extends UnicastRemoteObject implements RMIObserver, Serializable
{

	protected DonutEater() throws RemoteException
	{
	}

	private static final long serialVersionUID = -1283999352909467040L;

	String name = "Fred";
	
	@Override
	public void notifyFinished()
	{
		System.out.println(name +" was called");

	}

}
