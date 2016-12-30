package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ReserveController implements Initializable {
	@FXML ImageView imageView;
	@FXML Button okButton;
	@FXML Button cancelButton;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image imageInfo = new Image(getClass().getResourceAsStream("../images/java_von_kopf.jpg"));
		imageView.setImage(imageInfo);
	}

}
