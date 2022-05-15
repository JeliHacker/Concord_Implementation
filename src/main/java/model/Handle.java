package model;

public class Handle
{
	public String socialMedia;
	public String link;
	
	public String getSocialMedia()
	{
		return socialMedia;
	}
	public void setSocialMedia(String socialMedia)
	{
		this.socialMedia = socialMedia;
	}
	public String getLink()
	{
		return link;
	}
	public void setLink(String link)
	{
		this.link = link;
	}
	
	public Handle(String socialMedia, String link)
	{
		this.socialMedia = socialMedia;
		this.link = link;
	}
	
	public String toString()
	{
		String returnString = "SM: " + this.getSocialMedia() + ", Link: " + this.getLink();
		return returnString;
	}
	
	
	public static void main(String[] args)
	{
		Handle handle = new Handle("instagram", "www.instagram.com");
		System.out.println(handle.toString());
	}
	
}
