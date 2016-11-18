package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class SearchController extends MainController implements Initializable {
	
	@FXML private TableView<Book> table;
	
	@FXML private TableColumn<Book, String> name;
	@FXML private TableColumn<Book, String> author;
	@FXML private TableColumn<Book, String> availability;
	@FXML private TableColumn<Book, String> position;
	@FXML private TextField textFieldTitle;
	@FXML private TextField textFieldAuthor;
	@FXML private TextField textFieldISBN;
	
	public ObservableList<Book> list;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		System.out.println("Initialize Searchscene");
		name.setCellValueFactory(new PropertyValueFactory<Book, String>("name"));
		author.setCellValueFactory(new PropertyValueFactory<Book, String>("author"));
		availability.setCellValueFactory(new PropertyValueFactory<Book, String>("availability"));
		position.setCellValueFactory(new PropertyValueFactory<Book, String>("position"));
	}
	

	public void handleButtonSearchBooks(ActionEvent event) {
		System.out.println("Pressed Search Button");
		Model model = new Model();
		
		if(textFieldTitle.getText().toUpperCase().contains("JAVA") 
				&& textFieldAuthor.getText().toUpperCase().equals("ULLENBOOM")) {
			list = model.generateSearchList(model.ULLENBOOM);
		}
		else if(textFieldTitle.getText().toUpperCase().contains("JAVA") && textFieldAuthor.getText().equals("")) {
			list = model.generateSearchList(model.JAVAFILTER);
		}
		else if(textFieldTitle.getText().toUpperCase().contains("") && textFieldAuthor.getText().equals("")) {
			list = model.generateSearchList(model.ALLFILTER);
		}
		
		table.setItems(list);
		
	}

	
	
}
