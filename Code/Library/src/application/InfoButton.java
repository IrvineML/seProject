package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
				
			}
		});
	}
}
