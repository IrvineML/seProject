package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class AccountController extends MainController implements Initializable {
	
	@FXML private TableView<Book2> table;
	@FXML private TableView<Book2> reserveTable;
	
	@FXML private TableColumn<Book2, VBox> action;
	@FXML private TableColumn<Book2, HBox> completeBox;
	
	@FXML private TableColumn<Book2, VBox> reserveAction;
	@FXML private TableColumn<Book2, HBox> reserveCompleteBox;
	
	@FXML private Label fakeLabel;
	@FXML private Label reserveLabel;
	@FXML private ScrollPane scrollPane;
	
	public ObservableList<Book2> list;
	public ObservableList<Book2> reserveList;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Initialize Searchscene");
		completeBox.setCellValueFactory(new PropertyValueFactory<Book2, HBox>("completeBox"));
		action.setCellValueFactory(new PropertyValueFactory<Book2,VBox>("buttonBox"));
		reserveCompleteBox.setCellValueFactory(new PropertyValueFactory<Book2, HBox>("completeBox"));
		reserveAction.setCellValueFactory(new PropertyValueFactory<Book2,VBox>("buttonBox"));
		
		//Set Color for Background and Button
		setNavButtonStyle(accountBtn);
		
		Model model = new Model(this);
		list = model.generateAccountList();
		table.setItems(list);
		reserveList = model.generateReserveList();
		reserveTable.setItems(reserveList);
		reserveTable.setVisible(false);
		reserveLabel.setVisible(false);
		scrollPane.setVbarPolicy(ScrollBarPolicy.NEVER);
		fakeLabel.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				reserveTable.setVisible(true);
				reserveLabel.setVisible(true);
				scrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
				
			}
			
		});
	}
	
}
