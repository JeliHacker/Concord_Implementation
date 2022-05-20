package mathServer;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathServerTest
{

	MathServer ms;
	Registry registry;
	
	@BeforeEach
	void setUp() throws Exception
	{
		ms = new MathServer();
		
		registry = LocateRegistry.createRegistry(3099);
		registry.rebind("MATHS", ms);
		System.setProperty("java.rmi.server.hostname","192.168.1.2");
		String[] names = registry.list();
		for(String name:names)
		{
			System.out.println("name " + name);
		}
		
	}
	
	@Test
	void testAddNums()
	{
		MathServerInterface mp;
		int answer = -1;
		try
		{
			
			
			mp = (MathServerInterface) Naming.lookup("rmi://127.0.0.1/MATHS");

			answer = mp.addNumbers(5, 10);

			
		} catch (RemoteException | NotBoundException | MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Bad call to registry");
		} 
		assertEquals(15, answer);
		assertEquals(1, ms.getVisits());
	}

	@AfterEach
	void tearDown() throws Exception
	{
		//registry.unbind("MATHS");
	}


}
