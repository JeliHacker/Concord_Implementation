package concord;

import java.util.ArrayList;

public class User
{
	public String username;
	public String password;
	public int ID;
	ArrayList<User> blocked_users = new ArrayList<User>(5);
	public Profile profile;
	ArrayList<Integer> programID = new ArrayList<Integer>(5);
	public boolean current_status;
	

	
	public User()
	{
		
	}
	

}