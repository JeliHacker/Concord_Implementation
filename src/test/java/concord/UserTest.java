package concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest
{
	User u = new User();
	
	@BeforeEach
	void setUp() throws Exception
	{
		
		u.setRealName("eli");
		u.setPassword("password");
		u.setUsername("jeli");
		u.setID();
		u.setOnline(false);
	}

	@AfterEach
	void tearDown() throws Exception
	{
	}

	@Test
	void test()
	{
		assertEquals(u.getRealName(), "eli");
		assertEquals(u.getPassword(), "password");
		assertEquals(u.getUsername(), "jeli");
		assertNotNull(u.getID());
		assertEquals(u.isOnline(), false);
		//assertEquals(, not(null));
		//fail("Not yet implemented");
		System.out.println("works");
	}

}
