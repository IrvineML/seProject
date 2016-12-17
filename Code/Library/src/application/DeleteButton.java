package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DeleteButton extends Button{
	Book book;
	final MainController controller; 
	
	public DeleteButton() {
		book = null;
		controller = null;
		Image imageInfo = new Image(getClass().getResourceAsStream("../images/delete.png"));
		this.setScaleX(1.0);
		this.setScaleY(1.0);
		this.setGraphic(new ImageView(imageInfo));
		this.setPadding(new Insets(0.5, 0.5, 0.5, 0.5));
		this.setTooltip(new Tooltip("Lösche Buch"));
		this.setMinSize(160, 20);
		this.setText("Artikel entfernen");
	}
	
	public DeleteButton(Book book, MainController controller) {
		this.book = book;
		this.controller = controller;
		Image imageInfo = new Image(getClass().getResourceAsStream("../images/delete.png"));
		this.setScaleX(1.0);
		this.setScaleY(1.0);
		this.setGraphic(new ImageView(imageInfo));
		this.setPadding(new Insets(0.5, 0.5, 0.5, 0.5));
		this.setTooltip(new Tooltip("Lösche Buch"));
		this.setMinSize(160, 20);
		this.setText("Artikel entfernen");
		this.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Delete Button pressed. ISBN: " + book.getIsbn());
				if(controller instanceof BorrowController) {
					
					for(int i = 0; i < Model.getBorrowList().size(); i++) {
						if(book.equals(Model.getBorrowList().get(i)))
						{
							System.out.println(Model.getBorrowList().get(i).getIsbn());
							Model.getBorrowList().remove(i);
							((BorrowController) controller).updateList(Model.getBorrowList());
						}
					}
				}
				else if(controller instanceof ReturnController) {
					
					for(int i = 0; i < Model.getBorrowList().size(); i++) {
						if(book.equals(Model.getBorrowList().get(i)))
						{
							System.out.println(Model.getBorrowList().get(i).getIsbn());
							Model.getBorrowList().remove(i);
							((ReturnController) controller).updateList(Model.getBorrowList());
						}
					}
				}
			}
		});
	}

}
