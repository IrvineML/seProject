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

public abstract class MainController {
	
	public final int ControllerID = 0;
	
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
	
	@FXML
	protected AnchorPane topAnchorPane;
	
	protected Parent root;
	
	//Handler f�r die Buttons des Men�s
	@FXML
	public void handleButtonAction(ActionEvent event) throws IOException{
		Stage stage; 
		//Parent root;
   
		if(event.getSource()==searchBtn) {
			System.out.println("Pressed Btn1");
			//get reference to the button's stage         
			stage =(Stage) searchBtn.getScene().getWindow();
			//load up OTHER FXML document
			root = FXMLLoader.load(getClass().getResource("../View/Search.fxml"));
		}
	
		else if(event.getSource()==borrowBtn) {
			System.out.println("Pressed Btn2");
			//get reference to the button's stage         
			stage =(Stage) borrowBtn.getScene().getWindow();
			//load up OTHER FXML document
			root = FXMLLoader.load(getClass().getResource("../View/Borrow.fxml"));
		}
	
		else if(event.getSource()==returnBtn) {
			System.out.println("Pressed Btn3");
			//get reference to the button's stage         
			stage =(Stage) returnBtn.getScene().getWindow();
			//load up OTHER FXML document
			root = FXMLLoader.load(getClass().getResource("../View/Return.fxml"));
	    }
	   
	    else {
	        stage=(Stage) accountBtn.getScene().getWindow();
	        root = FXMLLoader.load(getClass().getResource("../View/Account.fxml"));
	    }
		//create a new scene with root and set the stage
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("../View/application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	protected void setNavButtonStyle(Button button) {
		
		searchBtn.getStyleClass().add("nav-button");
		borrowBtn.getStyleClass().add("nav-button");
		returnBtn.getStyleClass().add("nav-button");
		accountBtn.getStyleClass().add("nav-button");
		leftVBox.getStyleClass().add("vbox");
		
		if(button != null) {
			button.getStyleClass().remove("nav-button");
			button.getStyleClass().add("nav-button-selected");
		}
	}
	
}
