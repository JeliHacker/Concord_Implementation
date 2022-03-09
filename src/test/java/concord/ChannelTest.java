package concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChannelTest
{
	Channel exampleChannel = new Channel("Lobby", "A place to chat");
	User user = new User("username", "realname", "password");
	Message exMessage = new Message("hey there", user.ID);
	
	@BeforeEach
	void setUp() throws Exception
	{
		exampleChannel.addMessage(exMessage);
		exMessage.setPinned(true);
	}

	@AfterEach
	void tearDown() throws Exception
	{
	}

	@Test
	void test()
	{
		// Pin messages
		assertEquals(true, exMessage.isPinned);
		exMessage.setPinned(false);
		assertEquals(false, exMessage.isPinned);
		
		
		System.out.println("Passes all tests!");
	}

}
