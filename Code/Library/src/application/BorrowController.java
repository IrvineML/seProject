package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class BorrowController extends MainController implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		//Set Color for Background and Button
		borrowBtn.setStyle("-fx-base: #9EE1C5;");
		centerAnchorPane.setStyle("-fx-background-color: #F5F5F5;");
		leftVBox.getStyleClass().add("vbox");
	}

}
