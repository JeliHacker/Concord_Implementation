package concord;



public class User_Role
{
	public String roleName;
	public int program_ID;
	public Permission permission;
	
	public String getRoleName()
	{
		return roleName;
	}
	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
	}
	public Permission getPermission()
	{
		return permission;
	}
	public void setPermission(Permission permission)
	{
		this.permission = permission;
	}
	
}
