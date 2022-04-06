package concord;

import java.util.HashMap;

public class Permission
{
	public String roleType;
	HashMap<Object, Object> flags = new HashMap<>();
	
	public Permission()
	{
		
	}

	public String getRoleType()
	{
		return roleType;
	}

	public void setRoleType(String roleType)
	{
		this.roleType = roleType;
	}

	public HashMap<Object, Object> getFlags()
	{
		return flags;
	}

	public void setFlags(HashMap<Object, Object> flags)
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
