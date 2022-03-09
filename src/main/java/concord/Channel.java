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
	
	public void addMessage(Message message)
	{
		messages.add(message);
	}
	
	public Channel(String channelName, String channelDescription)
	{
		this.channelName = channelName;
		this.channelDescription = channelDescription;
	}
	
	public String messagesToString()
	{
		int count = 0;
		String returnString = "";
		
		while(count < messages.size())
		{
			returnString = returnString + messages.get(count).toString();
			
			
			boolean isLastMessage = (count == (messages.size()-1));
			
			// adds a line space, unless its the last channel
			if(!(isLastMessage))
			{
				returnString += "\n";
			}
			
			count++;
			
		}
		return returnString;
	}
	
	public String toString()
	{
		String returnString = "Name: " + this.channelName + "\n"
				+ "Description: " + this.channelDescription + "\n"
				+ "Messages: " + this.messages.toString();
		return returnString;
	}
	
	public static void main(String[] args)
	{
		Channel exampleChannel = new Channel("Lobby", "A place to chat");
		User user = new User("username", "realname", "password");
		
		Message exMessage = new Message("hey there", user.ID);
		exampleChannel.addMessage(exMessage);
		System.out.println(exampleChannel.toString());
		
		exMessage.setPinned(true);
		System.out.println(exMessage.isPinned);
		System.out.println("works");
	}
}
