package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ReserveButton extends Button {
	
	public ReserveButton() {
		Image imageInfo = new Image(getClass().getResourceAsStream("../images/reserve2.png"));
		this.setGraphic(new ImageView(imageInfo));
		this.setPadding(new Insets(0.5, 0.5, 0.5, 0.5));
		this.setTooltip(new Tooltip("Buch reservieren"));
		this.setScaleX(1.0);
		this.setScaleY(1.0);
		this.setMinSize(110, 25);
		this.setMaxSize(110,25);
		this.setAlignment(Pos.BASELINE_LEFT);
		this.setText("Reservieren");
		
		
		this.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Reserve Button pressed");
				Stage stage = new Stage();
				try {
					AnchorPane page = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/Reserve.fxml"));
					Scene scene = new Scene(page);
					scene.getStylesheets().add(getClass().getResource("../View/application.css").toExternalForm());
		            stage.setScene(scene);
		            stage.setTitle("Reservieren");
		            stage.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

}
