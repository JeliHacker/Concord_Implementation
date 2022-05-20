package mathServer;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DonutShopTest
{
	
	DonutShop ds;
	

	@BeforeEach
	void setUp() throws Exception
	{
		ds = new DonutShop();
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.rebind("DONUT", ds);
		
		
		
	}

	@AfterEach
	void tearDown() throws Exception
	{
	}

	@Test
	void test()
	{
		
		try
		{
			DonutEater eater = new DonutEater();
			RMIObserved observed = (RMIObserved) Naming.lookup("rmi://127.0.0.1/DONUT");
			
			observed.addObserver(eater);
			eater.name = "Tony";
			ds.makeDonuts();
			
			
			
			
		} catch (MalformedURLException | RemoteException | NotBoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("I failed");
		}
		
				
				
	}

}
