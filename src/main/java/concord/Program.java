package concord;

import java.util.ArrayList;
import java.util.UUID;

public class Program
{

	public P_Profile programProfile;
	public UUID program_ID;
	public ArrayList<Channel> channels = new ArrayList<Channel>(1);
	
	
	
	
	

	
	public P_Profile getProgramProfile()
	{
		return programProfile;
	}

	public void setProgramProfile(P_Profile programProfile)
	{
		this.programProfile = programProfile;
	}

	public UUID getProgram_ID()
	{
		return program_ID;
	}

	public void setProgram_ID(UUID program_ID)
	{
		this.program_ID = program_ID;
	}





	public void addUser(UUID userID)
	{
		// take user out of programProfile members
		//programProfile.members
	}

	public Channel createChannel(UUID user)
	{
		Channel channel = new Channel();
		return channel;
	}
	
	
}
