package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ReturnController extends MainController implements Initializable {
	
	@FXML private TableColumn<Book2, VBox> action;
	@FXML private TableColumn<Book2, HBox> completeBox;
	@FXML private TableView<Book2> table;
	@FXML private Label successMessage;
	
	public ObservableList<Book2> list;
	
	private int count = 1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		completeBox.setCellValueFactory(new PropertyValueFactory<Book2, HBox>("completeBox"));
		action.setCellValueFactory(new PropertyValueFactory<Book2,VBox>("buttonBox"));
		
		//Set Color for Background and Button
		setNavButtonStyle(returnBtn);
	}
	
	public void barcodeButtonHandler(ActionEvent actionEvent) {
		
		if(successMessage.isVisible()) {
			successMessage.setVisible(false);
		}
		
		Model model = new Model(this);
		list = model.generateBorrowList(count++);
		table.setItems(list);
	}
	
	public void returnButtonHandler(ActionEvent actionEvent) {
		
		if(list != null && !list.isEmpty()) {
			list.remove(0,list.size());
			successMessage.setVisible(true);
		}
	}
	
	public void updateList(ObservableList<Book2> list) {
		table.setItems(list);
	}

}
