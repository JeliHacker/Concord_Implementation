package concord;

import java.util.ArrayList;
import java.util.UUID;

public class User
{
	public String username;
	public String realName;

	public String password;
	public UUID ID;
	ArrayList<User> blocked_users = new ArrayList<User>(5);
	public Profile profile;
	ArrayList<Integer> programID = new ArrayList<Integer>(5);
	public boolean isOnline;
	

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}


	public String getRealName()
	{
		return realName;
	}



	public void setRealName(String realName)
	{
		this.realName = realName;
	}


	public String getPassword()
	{
		return password;
	}


	public void setPassword(String password)
	{
		this.password = password;
	}

	public void setID()
	{
		this.ID = UUID.randomUUID();
	}
	
	
	public UUID getID()
	{
		return ID;
	}


	public boolean isOnline()
	{
		return isOnline;
	}

	public void setOnline(boolean isOnline)
	{
		this.isOnline = isOnline;
	}

	public User()
	{
		
	}
	
	public String toString()
	{
		
		return getRealName();
		
	}
	
	public static void main(String[] args) 
	{
		User u = new User();
		u.setRealName("eli");
		u.setPassword("password");
		u.setUsername("jeli");
		u.setID();
		u.setOnline(false);
		System.out.println((u.getRealName()));
		System.out.println((u.getPassword()));
		System.out.println((u.getUsername()));
		System.out.println((u.getID()));
		System.out.println((u.isOnline()));
	}

}

