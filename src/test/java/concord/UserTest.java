package concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest
{
	User u = new User();
	User annoyingUser = new User();
	User b = new User();
	User c = new User();
	User d = new User();
	User e = new User();
	User f = new User();
	
	@BeforeEach
	void setUp() throws Exception
	{
		
		u.setRealName("eli");
		u.setPassword("password");
		u.setUsername("jeli");
		u.setID();
		u.setOnline(false);
		
		annoyingUser.setRealName("aj");
		u.blockUser(annoyingUser);
	}

	@AfterEach
	void tearDown() throws Exception
	{
		
	}

	@Test
	void test()
	{
		// A user has a user name, a real name, and a password
		assertEquals(u.getRealName(), "eli");	
		assertEquals(u.getPassword(), "password");
		assertEquals(u.getUsername(), "jeli");
		
		//A user has a unique id - integer
		assertNotNull(u.getID());
		
		
		// User 's current status (online, offline)
		assertEquals(u.isOnline(), false);
		
		// Blocking people 
		assertEquals(u.blocked_users.get(0).getRealName(), "aj");
		
		//fail("Not yet implemented");
		System.out.println("works");
	}

}
