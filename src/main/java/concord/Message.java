package concord;

import java.sql.Timestamp;
import java.util.UUID;

public class Message
{
	public UUID messageID;	
	public UUID user_id;
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
		return user_id;
	}
	public void setUser_id(UUID user_id)
	{
		this.user_id = user_id;
	}
	public boolean isPinned()
	{
		return isPinned;
	}
	
	public void setPinned(boolean isPinned)
	{
		this.isPinned = isPinned;
	}
	
	
	
	
}
