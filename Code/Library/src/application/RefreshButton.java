package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RefreshButton extends Button {

	public RefreshButton() {
		Image imageInfo = new Image(getClass().getResourceAsStream("../images/refresh.png"));
		this.setScaleX(0.7);
		this.setScaleY(0.7);
		this.setGraphic(new ImageView(imageInfo));
		this.setPadding(new Insets(0.5, 0.5, 0.5, 0.5));
		this.setTooltip(new Tooltip("Verlängere die Leihfrist"));
		this.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Refresh Button pressed");
			}
		});
	}
}
