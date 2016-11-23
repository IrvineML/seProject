package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AccountController extends MainController implements Initializable {
	
@FXML private TableView<Book> table;
	
	@FXML private TableColumn<Book, String> name;
	@FXML private TableColumn<Book, String> author;
	@FXML private TableColumn<Book, String> from;
	@FXML private TableColumn<Book, String> until;
	
	public ObservableList<Book> list;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Initialize Searchscene");
		name.setCellValueFactory(new PropertyValueFactory<Book, String>("name"));
		author.setCellValueFactory(new PropertyValueFactory<Book, String>("author"));
		from.setCellValueFactory(new PropertyValueFactory<Book, String>("from"));
		until.setCellValueFactory(new PropertyValueFactory<Book, String>("until"));
		
		//Set Color for Background and Button
		setNavButtonStyle(accountBtn);
		
		Model model = new Model();
		list = model.generateAccountList();
		table.setItems(list);
	}
	
}
