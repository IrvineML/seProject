package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class InfoButton extends Button {

	public InfoButton() {
		Image imageInfo = new Image(getClass().getResourceAsStream("../images/info.png"));
		this.setScaleX(1.0);
		this.setScaleY(1.0);
		this.setGraphic(new ImageView(imageInfo));
		this.setText("Details anzeigen");
		this.setPadding(new Insets(0.5, 0.5, 0.5, 0.5));
		this.setTooltip(new Tooltip("Zeige mehr Informationen"));
		this.setMinSize(160, 20);
		this.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Info Button pressed");
				
			}
		});
	}
}
