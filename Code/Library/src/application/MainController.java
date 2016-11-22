package application;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	protected Button searchBtn;
	
	@FXML
	protected Button borrowBtn;
	
	@FXML
	protected Button returnBtn;
	
	@FXML
	protected Button accountBtn;
	
	@FXML
	protected VBox leftVBox;
	
	@FXML
	protected AnchorPane centerAnchorPane;
	
	protected Parent root;
	
	//Handler für die Buttons des Menüs
	@FXML
	public void handleButtonAction(ActionEvent event) throws IOException{
		Stage stage; 
		//Parent root;
   
		if(event.getSource()==searchBtn) {
			System.out.println("Pressed Btn1");
			//get reference to the button's stage         
			stage =(Stage) searchBtn.getScene().getWindow();
			//load up OTHER FXML document
			root = FXMLLoader.load(getClass().getResource("Search.fxml"));
		}
	
		else if(event.getSource()==borrowBtn) {
			System.out.println("Pressed Btn2");
			//get reference to the button's stage         
			stage =(Stage) borrowBtn.getScene().getWindow();
			//load up OTHER FXML document
			root = FXMLLoader.load(getClass().getResource("Borrow.fxml"));
		}
	
		else if(event.getSource()==returnBtn) {
			System.out.println("Pressed Btn3");
			//get reference to the button's stage         
			stage =(Stage) returnBtn.getScene().getWindow();
			//load up OTHER FXML document
			root = FXMLLoader.load(getClass().getResource("Return.fxml"));
	    }
	   
	    else {
	        stage=(Stage) accountBtn.getScene().getWindow();
	        root = FXMLLoader.load(getClass().getResource("Account.fxml"));
	    }
		//create a new scene with root and set the stage
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	

}
