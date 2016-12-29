package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class InselDetailController implements Initializable{
	
	@FXML Button okButton;
	@FXML ImageView imageView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image imageInfo = new Image(getClass().getResourceAsStream("../images/java2.jpg"));
		imageView.setImage(imageInfo);
		
	}
	
	public void close(ActionEvent event) {
		Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
	}
	
	
}
