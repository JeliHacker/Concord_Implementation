package concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProgramTest
{
	Program program = new Program();
	@BeforeEach
	void setUp() throws Exception
	{
		program.createChannel("Lobby", "A place to chat");
		program.createChannel("Exec", "For people in executive positions");
	}

	@AfterEach
	void tearDown() throws Exception
	{
	}

	@Test
	void test()
	{
		String expectedProgramString = "Name: Lobby, Description: A place to chat\n"
				+ "Name: Exec, Description: For people in executive positions";
		
		// A server can have multiple channels
		assertEquals(expectedProgramString, program.toString());
	}

}
