package application;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;


public class StartController extends MainController implements Initializable{
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//Set Color for Background and Button
		setNavButtonStyle(null);
	}
}
