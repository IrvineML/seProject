package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LoginController extends MainController {
	@FXML
	Button loginButton;
	
	public void onLoginClick(ActionEvent actionEvent) {
		Stage stage = (Stage) loginButton.getScene().getWindow();
        try {
        	
			root = FXMLLoader.load(getClass().getResource("Account.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
