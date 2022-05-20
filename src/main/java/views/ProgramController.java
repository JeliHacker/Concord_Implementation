package views;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import model.Channel;
import model.Message;
import model.Program;
import model.DataModel;
import model.NavigationModel;
import model.User;

public class ProgramController
{
	NavigationModel model;
	DataModel d_m;
	
	@FXML
    private Button AddUsers_B;

    @FXML
    private ListView<?> Message_LV;
    
    

    @FXML
    private TextField Msg_TB;

    @FXML
    private ListView<?> Program_LV;

    @FXML
    private Button Send_B;

    
    
    @FXML
    private ListView<?> User_LV;

    @FXML
    private Button addChannel_B;

    @FXML
    private Button addProgram_B;

    @FXML
    private ListView<?> channel_LV;

    @FXML
    private Button userButton;



	
	public void setModel(NavigationModel new_model, DataModel new_dm)
	{
		model = new_model;
		d_m = new_dm;
		@SuppressWarnings("unchecked")
		ListView<Program> p = (ListView<Program>) Program_LV;
		p.setItems(d_m.program_list);
		
		@SuppressWarnings("unchecked")
		ListView<Channel> c = (ListView<Channel>) channel_LV;
		c.setItems(d_m.channel_list);
		
		@SuppressWarnings("unchecked")
		ListView<Message> m = (ListView<Message>) Message_LV;
		m.setItems(d_m.message_list);
		
		
		@SuppressWarnings("unchecked")
		ListView<User> u = (ListView<User>) User_LV;
		u.setItems(d_m.user_list);
		
		Send_B.setPadding(Insets.EMPTY);
		
	}

	
    @FXML
    void OnClickUser(ActionEvent event) 
    {
    	model.user_display();
    }
    
    @FXML
    void OnClickAddProgram(ActionEvent event) 
    {
    	model.open_AddPrograms();
    	
    }
    
    @FXML
    void OnClickAddChannel(ActionEvent event) 
    {
    	model.open_AddChannels();
    }
    
    @FXML
    void OnClickAddUser(ActionEvent event) 
    {
    	model.open_AddUser();
    }

    @FXML
    void OnClickEmoteButton(ActionEvent event) {
    	model.openEmotePage();
    }
    
    @FXML
    void OnClickSend(ActionEvent event) 
    {
    	String msg = Msg_TB.textProperty().get();
    	if(msg != "")
    	{
    		d_m.add_message(msg);
        	Msg_TB.setText("");
    	}
    	
    	Msg_TB.setOnKeyPressed(new EventHandler<KeyEvent>() 
    	{
    	    @Override
    	    public void handle(KeyEvent ke) {
    	        if (ke.getCode().equals(KeyCode.ENTER)) {
    	        	System.out.println("121");
    	        	if(msg != "")
    	        	{
    	        		d_m.add_message(msg);
    	            	Msg_TB.setText("");
    	        	}
    	        }
    	    }
    	});
    }
    
    @FXML
    public void onEnter(ActionEvent ae)
    {
    	System.out.println("test");
    	String msg = Msg_TB.textProperty().get();
    	if(msg != "")
    	{
    		d_m.add_message(msg);
        	Msg_TB.setText("");
    	}
    }
	
    
}
