package mathServer;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MathServer 
	extends UnicastRemoteObject
	implements MathServerInterface, Serializable
{

	private static final long serialVersionUID = 1L;

	private int visits=0;
	
	public int getVisits()
	{
		return visits;
	}



	public void setVisits(int visits)
	{
		this.visits = visits;
	}



	protected MathServer() throws RemoteException
	{
		super();
	}
	
	
	
	@Override
	public int addNumbers(int a, int b) throws RemoteException
	{
		visits++;
		System.out.println("Answering question");
		return a + b;
	}

	public static void main(String[] args)
	{
		while(true)
		{
			
			try
			{
				MathServer M = new MathServer();
				Naming.rebind("MATHS", M);
				
			} catch (RemoteException e)
			{
				// TODO Auto-generated catch block
				System.out.println("Oh no!");
				e.printStackTrace();
			} catch (MalformedURLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
