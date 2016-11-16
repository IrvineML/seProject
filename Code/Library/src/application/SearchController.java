package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SearchController extends MainController implements Initializable {
	
	@FXML private TableView<Book> table;
	
	@FXML private TableColumn<Book, String> name;
	@FXML private TableColumn<Book, String> author;
	@FXML private TableColumn<Book, String> isbn;
	@FXML private TableColumn<Book, String> year;
	
	public ObservableList<Book> list;

	public void handleButtonSearchBooks(ActionEvent event) {
		System.out.println("Pressed Search Button");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Model model = new Model();
		list = model.getSearchList();
		System.out.println("Initialize Searchscene");
		
		name.setCellValueFactory(new PropertyValueFactory<Book, String>("name"));
		author.setCellValueFactory(new PropertyValueFactory<Book, String>("author"));
		isbn.setCellValueFactory(new PropertyValueFactory<Book, String>("isbn"));
		year.setCellValueFactory(new PropertyValueFactory<Book, String>("year"));
		table.setItems(list);
	}
}
