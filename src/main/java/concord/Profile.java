package concord;

import java.awt.Image;
import java.util.ArrayList;

public class Profile
{

	public String real_name;

	public Image profilePic;
	
	public String description;
	
	ArrayList<Handle> handles = new ArrayList<Handle>(1);
	
	ArrayList<Hobby> hobbies = new ArrayList<Hobby>(1);
	
	
	//Getters and Setters
	
	public String getReal_name()
	{
		return real_name;
	}
	
	public void setReal_name(String real_name)
	{
		this.real_name = real_name;
	}
	
	public Image getProfilePic()
	{
		return profilePic;
	}
	
	public void setProfilePic(Image profilePic)
	{
		this.profilePic = profilePic;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public ArrayList<Handle> getHandles()
	{
		return handles;
	}
	
	public void setHandles(ArrayList<Handle> handles)
	{
		this.handles = handles;
	}
	
	public void addHandle(Handle handle)
	{
		this.handles.add(handle);
	}
	
	public void addHobby(Hobby hobby)
	{
		this.hobbies.add(hobby);
	}
	
	public String handlesToString()
	{
		int count = 0;
		String returnString = "";
		while(count < handles.size())
		{
			returnString = returnString + handles.get(count).toString();
			
			
			boolean isLastHandle = (count == (handles.size()-1));
			
			// adds a line space, unless its the last handle
			if(!(isLastHandle))
			{
				returnString += "\n";
			}
			
			count++;
			
		}
		return returnString;
	}
	
	public String hobbiesToString()
	{
		int count = 0;
		String returnString = "";
		while(count < hobbies.size())
		{
			returnString = returnString + hobbies.get(count).toString();
			
			
			boolean isLastHobby = (count == (hobbies.size()-1));
			
			// adds a line space, unless its the last hobby
			if(!(isLastHobby))
			{
				returnString += "\n";
			}
			
			count++;
			
		}
		return returnString;
	}
	
	public String toString()
	{
		String returnString = "";
		returnString = "Name: " + getReal_name() + "\n"
			+ "Description: " + getDescription() + "\n"
			+ "Handles: " + handles.toString() + "\n"
			+ "Hobbies: " + hobbies.toString();
		return returnString;
	}
	
	
	
	
	public static void main(String args[])
	{	
		Profile profile = new Profile();
		Handle ajInstagram = new Handle("Instagram", "www.instagram.com/aj");
		profile.handles.add(ajInstagram);
		
		
		System.out.println(profile.handles.get(0).toString());
		System.out.println("works");
	}
	
	
	
	
}
