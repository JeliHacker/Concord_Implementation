package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.NavigationModel;

public class LoginController
{
	NavigationModel model;
	
	
	public void setModel(NavigationModel newModel)
	{
		model = newModel;
	}

	public LoginController()
	{
		
	}
	
	@FXML
	private Button loginButton;
	
	@FXML 
	private Button registerButton;

	@FXML
	private PasswordField passwordPasswordField;
	
	@FXML
	private TextField usernameTextBox;
	
	

	@FXML
	void onClickLogin(ActionEvent event) 
	{
		model.open_program();
	}
	
	 @FXML
	    void onClickRegister(ActionEvent event) 
	 	{
		 	model.registration_display();
	    }
	
	
}
