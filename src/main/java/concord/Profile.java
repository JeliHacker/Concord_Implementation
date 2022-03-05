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
	
	/**
	 * @return the real_name
	 */
	public String getReal_name()
	{
		return real_name;
	}
	/**
	 * @param real_name the real_name to set
	 */
	public void setReal_name(String real_name)
	{
		this.real_name = real_name;
	}
	/**
	 * @return the profilePic
	 */
	public Image getProfilePic()
	{
		return profilePic;
	}
	/**
	 * @param profilePic the profilePic to set
	 */
	public void setProfilePic(Image profilePic)
	{
		this.profilePic = profilePic;
	}
	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	/**
	 * @return the handles
	 */
	public ArrayList<Handle> getHandles()
	{
		return handles;
	}
	/**
	 * @param handles the handles to set
	 */
	public void setHandles(ArrayList<Handle> handles)
	{
		this.handles = handles;
	}
	
	
	
	
	
}
