package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
			}
		});
	}

}
