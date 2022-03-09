package concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProfileTest
{
	Profile profile = new Profile();
	
	@BeforeEach
	void setUp() throws Exception
	{
		Handle ajInstagram = new Handle("Instagram", "www.instagram.com/aj");
		profile.handles.add(ajInstagram);
	}

	@AfterEach
	void tearDown() throws Exception
	{
	}

	@Test
	void test()
	{
		// Social media handles
		assertEquals("SM: Instagram, Link: www.instagram.com/aj", profile.handles.get(0).toString());
	}

}
