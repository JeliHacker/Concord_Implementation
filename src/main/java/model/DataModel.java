package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataModel
{
	public ObservableList<Program> program_list  = FXCollections.observableArrayList();
	public ObservableList<Channel> channel_list  = FXCollections.observableArrayList();
	public ObservableList<Message> message_list  = FXCollections.observableArrayList();
	public ObservableList<User> user_list  = FXCollections.observableArrayList();
	public String username = "Eli_Gooch";
	
	public DataModel()
	{
		
	}
	
	public void add_program(String p_name)
	{
		program_list.add(new Program(p_name));
	}
	
	public void add_channel(String c_name)
	{
		channel_list.add(new Channel(c_name));
	}
	
	public void add_message(String msg)
	{
		message_list.add(new Message(msg));
	}
	
	public void add_user(String username)
	{
		user_list.add(new User(username));
	}

}