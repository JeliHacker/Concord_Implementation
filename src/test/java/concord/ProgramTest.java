package concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Program;

class ProgramTest
{
	Program program = new Program("testProgram");
	
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
		System.out.println( program.toString());
		String expectedProgramString = "Lobby" + "\n" + "Exec";
	
		// A server can have multiple channels
		assertEquals(expectedProgramString, program.toString());
	}

}
