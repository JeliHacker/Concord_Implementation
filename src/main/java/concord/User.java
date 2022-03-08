package concord;

import java.util.ArrayList;

public class User
{
	public String username;
	public String realName;

	public String password;
	public int ID;
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
		System.out.println((u.getRealName()));
	}

}

