package concord;

public class Hobby
{
	public String hobbyName;
	public String hobbyDescription;
	
	public Hobby(String hobbyName, String hobbyDescription)
	{
		this.hobbyName = hobbyName;
		this.hobbyDescription = hobbyDescription;
	}
	
	
	
	public String getHobbyName()
	{
		return hobbyName;
	}



	public void setHobbyName(String hobbyName)
	{
		this.hobbyName = hobbyName;
	}



	public String getHobbyDescription()
	{
		return hobbyDescription;
	}



	public void setHobbyDescription(String hobbyDescription)
	{
		this.hobbyDescription = hobbyDescription;
	}



	public String toString()
	{
		String returnString = "Hobby: " + this.getHobbyName() + ", Description: " + this.getHobbyDescription();
		return returnString;
	}
}
