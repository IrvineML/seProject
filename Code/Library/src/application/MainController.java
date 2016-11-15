package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	Button btn1;
	
	@FXML
	Button btn2;
	
	@FXML
	Button btn3;
	
	@FXML
	Button btn4;
	
	
	@FXML
	private void handleButtonAction(ActionEvent event) throws IOException{
		Stage stage; 
		Parent root;
   
		if(event.getSource()==btn1) {
			System.out.println("Pressed Btn1");
			//get reference to the button's stage         
			stage =(Stage) btn1.getScene().getWindow();
			//load up OTHER FXML document
			root = FXMLLoader.load(getClass().getResource("Search.fxml"));
		}
	
		else if(event.getSource()==btn2) {
			System.out.println("Pressed Btn2");
			//get reference to the button's stage         
			stage =(Stage) btn2.getScene().getWindow();
			//load up OTHER FXML document
			root = FXMLLoader.load(getClass().getResource("Borrow.fxml"));
		}
	
		else if(event.getSource()==btn3) {
			System.out.println("Pressed Btn3");
			//get reference to the button's stage         
			stage =(Stage) btn3.getScene().getWindow();
			//load up OTHER FXML document
			root = FXMLLoader.load(getClass().getResource("Return.fxml"));
	    }
	   
	    else {
	        stage=(Stage) btn4.getScene().getWindow();
	        root = FXMLLoader.load(getClass().getResource("Account.fxml"));
	    }
		//create a new scene with root and set the stage
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
