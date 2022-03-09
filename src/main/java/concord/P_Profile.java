package concord;

import java.awt.Image;
import java.util.ArrayList;

public class P_Profile
{
	public Image server_logo;
	public String description;
	ArrayList<User> members = new ArrayList<User>(1);
	public int totalMembers;
	
	
	public ArrayList<User> membersOnline()
	{
		
		return members;
		
	}
	
	public static void printMembers(P_Profile programProfile)
	{
		int count = 0;
		while(count < programProfile.members.size())
		{
			System.out.println(programProfile.members.get(count));
			count++;
		}
		
	}
	
	public static void main(String[] args)
	{
		User u = new User("jeli", "eli", "password");
		u.setRealName("eli");
		u.setPassword("password");
		u.setUsername("jeli");
		u.setID();
		u.setOnline(false);
		P_Profile programProfile = new P_Profile(); 
		programProfile.members.add(u);
		printMembers(programProfile);
	}
}
