package mathServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class DonutShop extends UnicastRemoteObject implements RMIObserved
{

	private static final long serialVersionUID = 6581150813007521789L;

	protected DonutShop() throws RemoteException
	{
		
	}
	
	ArrayList<RMIObserver> observers = new ArrayList<RMIObserver>();

	@Override
	public void addObserver(RMIObserver o)
	{
		observers.add(o);
		
	}

	@Override
	public void removeObserver(RMIObserver o)
	{
		observers.remove(o);
		
	}
	
	public void notifyObservers()
	{
		for(RMIObserver o: observers)
		{
			try
			{
				o.notifyFinished();
			} catch (RemoteException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void makeDonuts()
	{
		notifyObservers();
	}
	
}
