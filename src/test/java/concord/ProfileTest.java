package concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Handle;
import model.Hobby;
import model.Profile;

class ProfileTest
{
	Profile profile = new Profile();
	
	@BeforeEach
	void setUp() throws Exception
	{
		profile.setReal_name("Aj");
		profile.setDescription("just a guy who likes to party");
		Handle ajInstagram = new Handle("Instagram", "www.instagram.com/aj");
		Handle ajTwitter = new Handle("Twitter", "www.twitter.com/aj");
		Hobby fishing = new Hobby("Fishing", "catch and release");
		Hobby soccer = new Hobby("Soccer", "they call it football in every other country");
		
		profile.handles.add(ajInstagram);
		profile.handles.add(ajTwitter);
		profile.hobbies.add(fishing);
		profile.hobbies.add(soccer);
	}

	@AfterEach
	void tearDown() throws Exception
	{
	}

	@Test
	void test()
	{
		
		String handlesString = "SM: Instagram, Link: www.instagram.com/aj\n"
				+ "SM: Twitter, Link: www.twitter.com/aj";
		
		
		// Social media handles
		assertEquals(handlesString, profile.handlesToString());
		
		String hobbiesString = "Hobby: Fishing, Description: catch and release\n"
				+ "Hobby: Soccer, Description: they call it football in every other country";
		
		
		// user interests/hobbies
		assertEquals(hobbiesString, profile.hobbiesToString());
		
		
		
		String profileString = "Name: Aj\n"
				+ "Description: just a guy who likes to party\n"
				+ "Handles: [SM: Instagram, Link: www.instagram.com/aj, SM: Twitter, Link: www.twitter.com/aj]\n"
				+ "Hobbies: [Hobby: Fishing, Description: catch and release, Hobby: Soccer, Description: they call it football in every other country]";
		
		// profile data for user
		// area for user self description in account
		assertEquals(profileString, profile.toString());
		
		System.out.println(profile.handlesToString());
		System.out.println(profile.hobbiesToString());
		System.out.println(profile.toString());
		
	}

}
