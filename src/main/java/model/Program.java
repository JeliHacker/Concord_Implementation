package model;

import java.util.ArrayList;
import java.util.UUID;

public class Program
{

	public P_Profile programProfile;
	public int program_ID;
	public ArrayList<Channel> channels = new ArrayList<Channel>(1);
	
	public String programName;
	public static ArrayList<EmoteEmoji> emojis = new ArrayList<EmoteEmoji>(0);
	
	public Program(String programName)
	{
		this.programName = programName;

	}
	
	
	public P_Profile getProgramProfile()
	{
		return programProfile;
	}

	public static ArrayList<EmoteEmoji> getEmoteArray()
	{
		return emojis;
	}
	
	public void setProgramProfile(P_Profile programProfile)
	{
		this.programProfile = programProfile;
	}

	public int getProgram_ID()
	{
		return program_ID;
	}

	public void setProgram_ID(int program_ID)
	{
		this.program_ID = program_ID;
	}





	public void addUser(UUID userID)
	{
		// take user out of programProfile members
		//programProfile.members
	}

	public Channel createChannel(String channelName, String channelDescription)
	{
		Channel channel = new Channel(channelName);
		channels.add(channel);
		return channel;
	}
	
	public void leaveProgram(User admin, User userToRemove)
	{
		if(admin.getID() == userToRemove.getID()) // if the user is trying to leave on his own
		{
			
		}
	}
	
	public String toString()
	{
		String returnString = "";
		int count = 0;
		
		while(count < channels.size())
		{
			returnString = returnString + channels.get(count).toString();
			
			
			boolean isLastChannel = (count == (channels.size()-1));
			
			// adds a line space, unless its the last channel
			if(!(isLastChannel))
			{
				returnString += "\n";
			}
			
			count++;
			
		}
		return returnString;
	}
	
	public static void main(String[] args)
	{
		Program program = new Program("ExampleProgram");
		program.createChannel("Lobby", "A place to chat");
		program.createChannel("Exec", "For people in executive positions");
		System.out.println(program.toString());
		
		System.out.println("works");
	}
}
