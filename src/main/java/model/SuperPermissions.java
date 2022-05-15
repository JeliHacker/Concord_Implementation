package model;

public class SuperPermissions extends Permission
{
	public SuperPermissions()
	{
		super.add_flag("Read", true);
		super.add_flag("Write", false);
		super.add_flag("Add", false);
		super.add_flag("Remove", false);
		super.add_flag("Channel", false);
	}
}
