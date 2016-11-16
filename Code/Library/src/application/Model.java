package application;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {
	private ObservableList<Book> searchList = null;
	
	private void generateSearchList() {
		searchList = FXCollections.observableArrayList(
		new Book("3836241307","Hans-Peter Habelitz","Programmieren lernen mit Java","2016"),
		new Book("3836241196","Christian Ullenboom", "Java ist auch eine Insel","2016"),
		new Book("3897214482","Kathy Sierra","Java von Kopf bis Fuﬂ","2006"),
		new Book("3864901693","Anton Epple","JavaFX 8: Grundlagen und fortgeschrittene Techniken","2015")
		);
	}
	
	public ObservableList<Book> getSearchList() {
		
		if(searchList == null || searchList.isEmpty()) {
			generateSearchList();
		}
		return searchList;
	}

}
