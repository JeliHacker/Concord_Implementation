package model;

import java.util.ArrayList;
import java.util.UUID;

public class Channel
{
	public int channelID;
	public String channelName;
	ArrayList<Message> messages = new ArrayList<Message>(1);
	
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
			else
			{
				messages.get(count).setPinned(false);
			}
			count++;
		}
	}
	
	public void addMessage(Message message)
	{
		messages.add(message);
	}
	
//	public Channel(String channelName, String channelDescription)
//	{
//		this.channelName = channelName;
//		this.channelDescription = channelDescription;
//	}
	
	public Channel(String channelName)
	{
		this.channelName = channelName;
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
		String returnString = this.channelName;
		return returnString;
	}
	
	public static void main(String[] args)
	{
		//Channel exampleChannel = new Channel("Lobby", "A place to chat");
		Channel exampleChannel = new Channel("Lobby");
		//User user = new User("username", "realname", "password");
		User user = new User("jeli");
		
//		Message exMessage = new Message("hey there", user.ID);
		Message exMessage = new Message("hey there");
		
		exampleChannel.addMessage(exMessage);
		System.out.println(exampleChannel.toString());
		
		exMessage.setPinned(true);
		System.out.println(exMessage.isPinned);
		System.out.println("works");
	}
}
