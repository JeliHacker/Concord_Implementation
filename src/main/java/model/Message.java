package model;

import java.sql.Timestamp;
import java.util.UUID;

public class Message
{
	public UUID messageID;	
	public UUID userID;
	public String message;
	public Timestamp timestamp;
	public boolean isPinned;
	
	

	public UUID getMessageID()
	{
		return messageID;
	}
	public void setMessageID(UUID messageID)
	{
		this.messageID = messageID;
	}
	public UUID getUser_id()
	{
		return userID;
	}
	public void setUser_id(UUID user_id)
	{
		this.userID = user_id;
	}
	public boolean isPinned()
	{
		return isPinned;
	}
	
	public void setPinned(boolean isPinned)
	{
		this.isPinned = isPinned;
	}
	
	
	
	
	public String getMessage()
	{
		return message;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	
	public String toString()
	{
		String returnString = "messageID: " + messageID.toString()
			+ ", " + userID.toString()
			+ ", " + message
			+ ", " + timestamp.toString()
			+ ", " + isPinned;
		
		return returnString;
	}
	
	public Message(String messageText, UUID user_id)
	{
		this.messageID = UUID.randomUUID();
		this.userID = user_id;
		this.message = messageText;
		
		Long datetime = System.currentTimeMillis();
		Timestamp currentTimestamp = new Timestamp(datetime);
		this.timestamp = currentTimestamp;
		this.isPinned = false;
		
		
	}
	
	public static void main(String[] args)
	{
		User user = new User("username", "realname", "password");
		Message exampleMessage = new Message("hey there", user.ID);
		
		System.out.println(exampleMessage.toString());
		System.out.println(exampleMessage.getMessage());
		
		
	}
	
}
