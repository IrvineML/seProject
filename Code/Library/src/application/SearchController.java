package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class SearchController extends MainController implements Initializable {
	
	@FXML private TableView<Book2> table;
	
	
	@FXML private TableColumn<Book2, VBox> action;
	@FXML private TableColumn<Book2, HBox> completeBox;
	@FXML private TextField textFieldTitle;
	@FXML private TextField textFieldAuthor;
	@FXML private TextField textFieldISBN;
	@FXML private Button startSearchBtn;
	
	public ObservableList<Book2> list;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		System.out.println("Initialize Searchscene");
		completeBox.setCellValueFactory(new PropertyValueFactory<Book2, HBox>("searchCompleteBox"));
		action.setCellValueFactory(new PropertyValueFactory<Book2,VBox>("buttonBox"));
		
		
		//Set Color for Background and Button
		setNavButtonStyle(searchBtn);		
		
	}
	

	public void handleButtonSearchBooks(ActionEvent event) {
		System.out.println("Pressed Search Button");
		Model model = new Model(this);
		
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
