package application;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {
	private ObservableList<Book> searchList = null;
	private ObservableList<Book> accountList = null;
	
	public final int JAVAFILTER = 1;
	public final int ALLFILTER = 2;
	public final int ULLENBOOM = 3;
	
	public ObservableList<Book> generateSearchList(int index) {
		
		if(index == 1) {
			searchList = FXCollections.observableArrayList(
				new Book("3836241307","Hans-Peter Habelitz","Programmieren lernen mit Java","2016","2","XY238"),
				new Book("3836241196","Christian Ullenboom", "Java ist auch eine Insel","2016","12","ZZ999"),
				new Book("3897214482","Kathy Sierra","Java von Kopf bis Fuß","2006","0",""),
				new Book("3864901693","Anton Epple","JavaFX 8: Grundlagen und fortgeschrittene Techniken","2015","5","WW223")
			);
		}
		else if(index == 2) {
			searchList = FXCollections.observableArrayList(
				new Book("3836241307","Hans-Peter Habelitz","Programmieren lernen mit Java","2016","2","XY238"),
				new Book("3836241196","Christian Ullenboom", "Java ist auch eine Insel","2016","12","ZZ999"),
				new Book("3897214482","Kathy Sierra","Java von Kopf bis Fuß","2006","0",""),
				new Book("3864901693","Anton Epple","JavaFX 8: Grundlagen und fortgeschrittene Techniken","2015","5","WW223"),
				new Book("3836220210","Jürgen Wolf","C++: Das umfassende Handbuch","2014","3","WX123"),
				new Book("3645604154","T. J. O'Connor","Python Hacking","2015","1","ZB012")
			);
		}
		else if(index == 3) {
			searchList = FXCollections.observableArrayList(
					new Book("3836241196","Christian Ullenboom", "Java ist auch eine Insel","2016","12","ZZ999")
			);
		}
		
		return searchList;
	}
	
	public ObservableList<Book> generateAccountList() {
		
		Book book1 = new Book("3836241196","Christian Ullenboom", "Java ist auch eine Insel","2016","12","ZZ999");
		Book book2 = new Book("3836220210","Jürgen Wolf","C++: Das umfassende Handbuch","2014","3","WX123");
		Book book3 = new Book("3645604154","T. J. O'Connor","Python Hacking","2015","1","ZB012");
		
		book1.setFrom("18.11.2016");
		book1.setUntil("18.01.2017");
		
		book2.setFrom("30.11.2016");
		book2.setUntil("30.01.2017");
		
		book3.setFrom("03.12.2016");
		book3.setUntil("03.02.2017");
		
		accountList = FXCollections.observableArrayList(
				book1,
				book2,
				book3
		);
		
		return accountList;
	}
	
public ObservableList<Book> generateBorrowList(int bookCount) {
		
		Book book1 = new Book("3836241196","Christian Ullenboom", "Java ist auch eine Insel","2016","12","ZZ999");
		Book book2 = new Book("3836220210","Jürgen Wolf","C++: Das umfassende Handbuch","2014","3","WX123");
		Book book3 = new Book("3645604154","T. J. O'Connor","Python Hacking","2015","1","ZB012");
		
		book1.setFrom("20.12.2016");
		book1.setUntil("03.02.2017");
		
		book2.setFrom("20.12.2016");
		book2.setUntil("03.02.2017");
		
		book3.setFrom("20.12.2016");
		book3.setUntil("03.02.2017");
		
		if(bookCount == 1) {
			accountList = FXCollections.observableArrayList(
					book1);
		}
		else if(bookCount == 2) {
			accountList = FXCollections.observableArrayList(
					book1,
					book2
			);
			
		}
		else {
			accountList = FXCollections.observableArrayList(
					book1,
					book2,
					book3
			);
		}
		
		return accountList;
	}
	
	

}
