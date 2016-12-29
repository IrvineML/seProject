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

public class InfoButton extends Button {

	public InfoButton() {
		Image imageInfo = new Image(getClass().getResourceAsStream("../images/info2.png"));
		this.setScaleX(1.0);
		this.setScaleY(1.0);
		ImageView iV = new ImageView(imageInfo);
		iV.setScaleX(0.8);
		iV.setScaleY(0.8);
		this.setGraphic(iV);
		this.setText("Details");
		this.setPadding(new Insets(0.5, 0.5, 0.5, 0.5));
		this.setTooltip(new Tooltip("Zeige mehr Informationen"));
		this.setMinSize(110, 25);
		this.setMaxSize(110,25);
		this.setAlignment(Pos.BASELINE_LEFT);
		this.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Info Button pressed");
				Stage stage = new Stage();
				try {
					AnchorPane page = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/InselDetail.fxml"));
					Scene scene = new Scene(page);
					scene.getStylesheets().add(getClass().getResource("../View/application.css").toExternalForm());
		            stage.setScene(scene);
		            stage.setTitle("Details");
		            stage.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}
