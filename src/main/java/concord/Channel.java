package concord;

import java.util.ArrayList;

public class Channel
{
	public int channelID;
	ArrayList<Message> messages = new ArrayList<Message>(1);
	public String channelDescription;
	public Message pinnedMessage;
	
	
	public void pin_message(int messageID)
	{
		
	}
}
