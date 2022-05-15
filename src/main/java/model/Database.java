package model;

import java.util.HashMap;

public class Database
{
	HashMap<User, Program> database = new HashMap<>();

	public HashMap<User, Program> getDatabase()
	{
		return database;
	}

	public void setDatabase(HashMap<User, Program> database)
	{
		this.database = database;
	}
	
}
