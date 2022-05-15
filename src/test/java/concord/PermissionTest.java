package concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.BasicPermissions;
import model.Permission;

class PermissionTest
{

	Permission permission;
	
	@BeforeEach
	void setUp() throws Exception
	{
		permission = new BasicPermissions();
	}

	@AfterEach
	void tearDown() throws Exception
	{
	}

	@Test
	void test()
	{
		System.out.println("Permission Tests");
		assertEquals(permission.flags.get("Read"), true);
		permission.remove_permission("Read");
		assertEquals(permission.flags.get("Read"), false);
		permission.give_permission("Read");
		assertEquals(permission.flags.get("Read"), true);
		permission.add_flag("Create_Channel", true);
		assertEquals(permission.flags.containsKey("Create_Channel"), true);
	}

}
