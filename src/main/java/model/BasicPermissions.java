package model;

public class BasicPermissions extends Permission
{
	public BasicPermissions()
	{
		super.add_flag("Read", true);
		super.add_flag("Write", true);
		super.add_flag("Add", false);
		super.add_flag("Remove", false);
	}
}
