package concord;

import java.util.ArrayList;
import java.util.UUID;

public class Channel
{
	public int channelID;
	public String channelName;
	ArrayList<Message> messages = new ArrayList<Message>(1);
	public String channelDescription;
	public Message pinnedMessage;
	
	
	public void pin_message(UUID messageID)
	{
		int count = 0;
		while(count < messages.size())
		{
			if(messages.get(count).getMessageID() == messageID)
			{
				messages.get(count).setPinned(true);
			}
			count++;
		}
	}
	
	public void addMessage(String messageText)
	{
		
	}
	
	public Channel(String channelName, String channelDescription)
	{
		this.channelName = channelName;
		this.channelDescription = channelDescription;
	}
	
	public String toString()
	{
		String returnString = "Name: " + this.channelName + ", Description: " + this.channelDescription;
		return returnString;
	}
}
