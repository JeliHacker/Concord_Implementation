package model;

//import java.awt.Image;
//import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

public class User
{

	public UUID ID;
	
	public String username;
	public String realName;
	public String password;
	
	public ArrayList<User> blocked_users = new ArrayList<User>(5);
	//ArrayList<User> friends = new ArrayList<User>(5);
	public Profile profile;
	public ArrayList<Integer> programID = new ArrayList<Integer>(5);
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

	public User(String username, String realname, String password)
	{
		setID();
		setUsername(username);
		setRealName(realname);
		setPassword(password);
		setOnline(true);
		
	}
	
	
	public void blockUser(User user)
	{
		this.blocked_users.add(user);
	}
	
	
	
	public String toString()
	{
		
		return getRealName();
		
	}
	
	public static void main(String[] args) 
	{
		/*
		File file = new File("/Users/jeligooch/eclipse-workspace/Sprint1Implementation/computer.jpeg");
		Image computer = file;
		Image image = new Image();
		*/
		User u = new User("jeli", "eli", "password");
		
		
		User annoyingUser = new User("ajtkh", "aj", "ajpass");
		
		u.blockUser(annoyingUser);
		
		System.out.println((u.getRealName()));
		System.out.println((u.getPassword()));
		System.out.println((u.getUsername()));
		System.out.println((u.getID()));
		System.out.println((u.isOnline()));
		System.out.println((u.blocked_users.get(0).getRealName()));
		
	}

}

