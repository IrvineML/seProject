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

public class ReturnController extends MainController implements Initializable {
	
	@FXML private TableColumn<Book, String> name;
	@FXML private TableColumn<Book, String> author;
	@FXML private TableColumn<Book, String> from;
	@FXML private TableColumn<Book, String> until;
	@FXML private TableColumn<Book, HBox> action;
	@FXML private TableView<Book> table;
	@FXML private Label successMessage;
	
	public ObservableList<Book> list;
	
	private int count = 1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		name.setCellValueFactory(new PropertyValueFactory<Book, String>("name"));
		author.setCellValueFactory(new PropertyValueFactory<Book, String>("author"));
		from.setCellValueFactory(new PropertyValueFactory<Book, String>("from"));
		until.setCellValueFactory(new PropertyValueFactory<Book, String>("until"));
		action.setCellValueFactory(new PropertyValueFactory<Book,HBox>("buttonBox"));
		
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
	
	public void updateList(ObservableList<Book> list) {
		table.setItems(list);
	}

}
