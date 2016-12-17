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
		this.setScaleX(1.0);
		this.setScaleY(1.0);
		this.setGraphic(new ImageView(imageInfo));
		this.setText("Ausleihfrist verlängern");
		this.setPadding(new Insets(0.5, 0.5, 0.5, 0.5));
		this.setTooltip(new Tooltip("Verlängere die Leihfrist"));
		this.setMinSize(160, 20);
		this.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Refresh Button pressed");
			}
		});
	}
}
