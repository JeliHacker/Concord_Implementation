package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.DataModel;
import model.NavigationModel;

public class AddChannelController
{
	NavigationModel nav_model;
	DataModel dm;
	
	public void setModel(NavigationModel model, DataModel d_m)
	{
		nav_model = model;
		dm = d_m;
	}

	@FXML
    private Button Cancel_B;

    @FXML
    void onClickCancel(ActionEvent event) 
    {
    	nav_model.open_program();
    }
}
