package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.DataModel;
import model.NavigationModel;

public class UserController
{

	NavigationModel model;
	DataModel dm;
	
	public void setModel(NavigationModel new_model, DataModel dm)
	{
		model = new_model;
		this.dm = dm;
		
		Username_L.setText(dm.username);
	}
	
	@FXML
    private Label Username_L;
	
	@FXML
    private Button BackButton;

    @FXML
    void OnClickBack(ActionEvent event)
    {
    	model.open_program();
    }
	
}
