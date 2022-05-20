package concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Channel;
import model.Message;
import model.User;

class ChannelTest
{
//	Channel exampleChannel1 = new Channel("Lobby");
//	User user1 = new User("username");
//	Message exMessage1 = new Message("hey there");
//	
//	@BeforeEach
//	void setUp() throws Exception
//	{
//		exampleChannel1.addMessage(exMessage1);
//		exMessage1.setPinned(true);
//	}
//
//	@AfterEach
//	void tearDown() throws Exception
//	{
//		
//	}
//
//	@Test
//	void test()
//	{
//		// Pin messages
//		assertEquals(true, exMessage1.isPinned);
//		exMessage1.setPinned(false);
//		assertEquals(false, exMessage1.isPinned);
//		
//		
//		System.out.println("Passes all tests!");
//	}
//	
	
	Channel exampleChannel = new Channel("lobby");
	User user = new User("username");
	Message exMessage = new Message("hey there");
	
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
		
		System.out.println(exampleChannel.toString());
		assertEquals(exampleChannel.toString(), "lobby");
		System.out.println("Passes all tests!");
	}

}
