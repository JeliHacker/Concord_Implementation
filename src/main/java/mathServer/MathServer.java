package mathServer;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class MathServer implements MathServerInterface, Serializable
{

	private static final long serialVersionUID = 1L;

	@Override
	public int addNumbers(int a, int b) throws RemoteException
	{
		return a + b;
	}

	public static void main(String[] args)
	{
		System.out.println("At least I can still print to the console");
		try
		{
			MathServer M = new MathServer();
			Naming.rebind("MATHS", M);
			
			
		} catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
