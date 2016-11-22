package application;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;


public class StartController extends MainController implements Initializable{
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//Set Color for Background and Button
		centerAnchorPane.setStyle("-fx-background-color: #F5F5F5;");
		leftVBox.getStyleClass().add("vbox");
	}
}
