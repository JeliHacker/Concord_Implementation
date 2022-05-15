package model;

import java.util.HashMap;

public class Permission
{
	public String roleType;
	
	public HashMap<String, Boolean> flags = new HashMap<String, Boolean>();
	
	public Permission()
	{
		
	}
	
	
	public String getRole_type()
	{
		return roleType;
	}
	/**
	 * @param role_type the role_type to set
	 */
	public void setRole_type(String roleType)
	{
		this.roleType = roleType;
	}
	/**
	 * @return the flags
	 */
	public HashMap<String, Boolean> getFlags()
	{
		return flags;
	}
	/**
	 * @param flags the flags to set
	 */
	public void setFlags(HashMap<String, Boolean> flags)
	{
		this.flags = flags;
	}
	
	public void add_flag(String flag, boolean bool)
	{
		flags.put(flag, bool);
	}
	
	public void remove_permission(String flag)
	{
		flags.put(flag, false);
	}
	
	public void give_permission(String flag)
	{
		flags.put(flag, true);
	}
	
}
