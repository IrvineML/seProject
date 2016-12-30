package application;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.util.ArrayList;


public class Model {
	private static ObservableList<Book2> searchList = null;
	private static ObservableList<Book2> accountList = null;
	private static ObservableList<Book2> borrowList = null;
	private static ObservableList<Book> returnList = null;
	private static ObservableList<Book2> reserveList = null;
	
	public final int JAVAFILTER = 1;
	public final int ALLFILTER = 2;
	public final int ULLENBOOM = 3;
	
	private MainController controller;
	
	public Model(MainController controller) {
		this.controller = controller;
		if(searchList == null) {
			searchList = FXCollections.observableArrayList();
		}
		if(accountList == null) {
			searchList = FXCollections.observableArrayList();
		}
		if(borrowList == null) {
			searchList = FXCollections.observableArrayList();
		}
		if(returnList == null) {
			searchList = FXCollections.observableArrayList();
		}
	}
	
	
	public ObservableList<Book2> generateSearchList(int index) {
		
		if(index == 1) {
			searchList = FXCollections.observableArrayList(
				new Book2("3836241307","Hans-Peter Habelitz","Programmieren lernen mit Java","2016","2","XY238"),
				new Book2("3836241196","Christian Ullenboom", "Java ist auch eine Insel","2016","12","ZZ999"),
				new Book2("3897214482","Kathy Sierra","Java von Kopf bis Fuß","2006","0",""),
				new Book2("3864901693","Anton Epple","JavaFX 8: Grundlagen und fortgeschrittene Techniken","2015","5","WW223")
			);
			
			ArrayList<String> pics = new ArrayList<>();
			pics.add("../images/programmieren_lernen.jpg");
			pics.add("../images/insel.jpg");
			pics.add("../images/java_von_kopf.jpg");
			pics.add("../images/javaFx8.jpg");
			
			for(int i = 0; i<pics.size(); i++) {
				searchList.get(i).setSearchBookImage(new ImageView(new Image(getClass().getResourceAsStream(pics.get(i)))));
				Button b1 = new InfoButton();
				VBox vbox1 = new VBox();
				vbox1.setSpacing(15);
				vbox1.setPadding(new Insets(15, 15, 15, 15));
				vbox1.getChildren().add(b1);
				searchList.get(i).setButtonBox(vbox1);
				if(i == 2) {
					Button b2 = new ReserveButton();
					vbox1.getChildren().add(b2);
				}
			}
			
			
		}
		else if(index == 2) {
			searchList = FXCollections.observableArrayList(
				new Book2("3836241307","Hans-Peter Habelitz","Programmieren lernen mit Java","2016","2","XY238"),
				new Book2("3836241196","Christian Ullenboom", "Java ist auch eine Insel","2016","12","ZZ999"),
				new Book2("3897214482","Kathy Sierra","Java von Kopf bis Fuß","2006","0",""),
				new Book2("3864901693","Anton Epple","JavaFX 8: Grundlagen und fortgeschrittene Techniken","2015","5","WW223"),
				new Book2("3836220210","Jürgen Wolf","C++: Das umfassende Handbuch","2014","3","WX123"),
				new Book2("3645604154","T. J. O'Connor","Python Hacking","2015","1","ZB012")
			);
			
			ArrayList<String> pics = new ArrayList<>();
			pics.add("../images/programmieren_lernen.jpg");
			pics.add("../images/insel.jpg");
			pics.add("../images/java_von_kopf.jpg");
			pics.add("../images/javaFx8.jpg");
			pics.add("../images/CPP.jpg");
			pics.add("../images/Phyton.jpg");
			
			for(int i = 0; i<pics.size(); i++) {
				searchList.get(i).setSearchBookImage(new ImageView(new Image(getClass().getResourceAsStream(pics.get(i)))));
				Button b1 = new InfoButton();
				VBox vbox1 = new VBox();
				vbox1.setSpacing(15);
				vbox1.setPadding(new Insets(15, 15, 15, 15));
				vbox1.getChildren().add(b1);
				searchList.get(i).setButtonBox(vbox1);
				if(i == 2) {
					Button b2 = new ReserveButton();
					vbox1.getChildren().add(b2);
				}
			}
			
			
		}
		
		else if(index == 3) {
			searchList = FXCollections.observableArrayList(
					new Book2("3836241196","Christian Ullenboom", "Java ist auch eine Insel","2016","12","ZZ999")
			);
			
			searchList.get(0).setSearchBookImage(new ImageView(new Image(getClass().getResourceAsStream("../images/insel.jpg"))));
		}
		
		for(int i = 0; i < searchList.size(); i++) {
			Button b1 = new InfoButton();
			HBox hbox1 = new HBox();
			hbox1.getChildren().add(b1);
			//Bsp. wenn kein Buch verfügbar ist
			if(i == 2) {
				hbox1.getChildren().add(new ReserveButton());
			}
			//searchList.get(i).setButtonBox(hbox1);
		}
		
		return searchList;
	}
	
	public ObservableList<Book2> generateAccountList() {
		
		Book2 book1 = new Book2("3836241196","Christian Ullenboom", "Java ist auch eine Insel","2016","12","ZZ999");
		Book2 book2 = new Book2("3836220210","Jürgen Wolf","C++: Das umfassende Handbuch","2014","3","WX123");
		Book2 book3 = new Book2("3645604154","T. J. O'Connor","Python Hacking","2015","1","ZB012");
		
		book1.setFrom("18.11.2016");
		book1.setUntilLabel("ausgeliehen bis 18.01.2017");
		Button b1 = new InfoButton();
		Button b11 = new RefreshButton();
		VBox hbox1 = new VBox();
		hbox1.setSpacing(15);
		hbox1.setPadding(new Insets(15, 15, 15, 15));
		hbox1.getChildren().add(b1);
		hbox1.getChildren().add(b11);
		book1.setButtonBox(hbox1);
		Image imageInfo1 = new Image(getClass().getResourceAsStream("../images/insel.jpg"));
		book1.setBookImage(new ImageView(imageInfo1));
		
		Button b2 = new InfoButton();
		Button b21 = new RefreshButton();
		book2.setFrom("30.11.2016");
		book2.setUntilLabel("ausgeliehen bis 30.01.2017");
		VBox hbox2 = new VBox();
		hbox2.setSpacing(15);
		hbox2.setPadding(new Insets(15, 15, 15, 15));
		hbox2.getChildren().add(b2);
		hbox2.getChildren().add(b21);
		book2.setButtonBox(hbox2);
		Image imageInfo2 = new Image(getClass().getResourceAsStream("../images/CPP.jpg"));
		book2.setBookImage(new ImageView(imageInfo2));
		
		Button b3 = new InfoButton();
		book3.setFrom("03.12.2016");
		book3.setUntilLabel("ausgeliehen bis 03.02.2017");
		VBox hbox3 = new VBox();
		hbox3.setSpacing(15);
		hbox3.setPadding(new Insets(15, 15, 15, 15));
		hbox3.getChildren().add(b3);
		book3.setButtonBox(hbox3);
		Image imageInfo3 = new Image(getClass().getResourceAsStream("../images/Phyton.jpg"));
		book3.setBookImage(new ImageView(imageInfo3));
		
		accountList = FXCollections.observableArrayList(
				book1,
				book2,
				book3
		);
		
		return accountList;
	}
	
public ObservableList<Book2> generateReserveList() {
		
		Book2 book1 = new Book2("","Square Enix", "Rise of the Tomb Raider: 20-jähriges Jubiläum - Day One Edition","2016","2","ZZ999");
		Book2 book2 = new Book2("","Linkin Park","Living Things","2010","3","WX123");
		
		book1.setFrom("18.11.2016");
		book1.setUntilLabel("vorraussichtlich verfügbar am 18.01.2017");
		Button b1 = new InfoButton();
		Button b11 = new DeleteButton();
		VBox hbox1 = new VBox();
		hbox1.setSpacing(15);
		hbox1.setPadding(new Insets(15, 15, 15, 15));
		hbox1.getChildren().add(b1);
		hbox1.getChildren().add(b11);
		book1.setButtonBox(hbox1);
		Image imageInfo1 = new Image(getClass().getResourceAsStream("../images/TombRaider.jpg"));
		book1.setBookImage(new ImageView(imageInfo1));
		
		Button b2 = new InfoButton();
		Button b21 = new DeleteButton();
		book2.setFrom("30.11.2016");
		book2.setUntilLabel("vorraussichtlich verfügbar am 30.01.2017");
		VBox hbox2 = new VBox();
		hbox2.setSpacing(15);
		hbox2.setPadding(new Insets(15, 15, 15, 15));
		hbox2.getChildren().add(b2);
		hbox2.getChildren().add(b21);
		book2.setButtonBox(hbox2);
		Image imageInfo2 = new Image(getClass().getResourceAsStream("../images/linkinPark.jpg"));
		book2.setBookImage(new ImageView(imageInfo2));
		
		
		reserveList = FXCollections.observableArrayList(
				book1,
				book2
		);
		
		return reserveList;
	}
	
	

	public ObservableList<Book2> generateBorrowList(int bookCount) {
		
		Book2 book1 = new Book2("3836241196","Christian Ullenboom", "Java ist auch eine Insel","2016","12","ZZ999");
		Book2 book2 = new Book2("3836220210","Jürgen Wolf","C++: Das umfassende Handbuch","2014","3","WX123");
		Book2 book3 = new Book2("3645604154","T. J. O'Connor","Python Hacking","2015","1","ZB012");
		
		book1.setFrom("20.12.2016");
		book1.setUntilLabel("ausgeliehen bis 18.01.2017");
		
		book2.setFrom("20.12.2016");
		book2.setUntilLabel("ausgeliehen bis 15.02.2017");
		
		book3.setFrom("20.12.2016");
		book3.setUntilLabel("ausgeliehen bis 25.02.2017");
		
		if(bookCount == 1) {
			borrowList = FXCollections.observableArrayList(
					book1);
			Image imageInfo1 = new Image(getClass().getResourceAsStream("../images/insel.jpg"));
			book1.setBookImage(new ImageView(imageInfo1));
			
		}
		else if(bookCount == 2) {
			borrowList = FXCollections.observableArrayList(
					book1,
					book2
			);
			Image imageInfo1 = new Image(getClass().getResourceAsStream("../images/insel.jpg"));
			book1.setBookImage(new ImageView(imageInfo1));
			Image imageInfo2 = new Image(getClass().getResourceAsStream("../images/CPP.jpg"));
			book2.setBookImage(new ImageView(imageInfo2));
			
		}
		else {
			borrowList = FXCollections.observableArrayList(
					book1,
					book2,
					book3
			);
			Image imageInfo1 = new Image(getClass().getResourceAsStream("../images/insel.jpg"));
			book1.setBookImage(new ImageView(imageInfo1));
			Image imageInfo2 = new Image(getClass().getResourceAsStream("../images/CPP.jpg"));
			book2.setBookImage(new ImageView(imageInfo2));
			Image imageInfo3 = new Image(getClass().getResourceAsStream("../images/Phyton.jpg"));
			book3.setBookImage(new ImageView(imageInfo3));
		}
		
		
		for(int i = 0; i < borrowList.size(); i++) {
			Button b1 = new DeleteButton(/*borrowList.get(i),controller*/);
			VBox vbox1 = new VBox();
			vbox1.getChildren().add(b1);
			vbox1.setSpacing(15);
			vbox1.setPadding(new Insets(15, 15, 15, 15));
			borrowList.get(i).setButtonBox(vbox1);
		}
		
		return borrowList;
	}
	
	public static ObservableList<Book2> getSearchList() {
		return searchList;
	}

	public static void setSearchList(ObservableList<Book2> searchList) {
		Model.searchList = searchList;
	}

	public static ObservableList<Book2> getAccountList() {
		return accountList;
	}

	public static void setAccountList(ObservableList<Book2> accountList) {
		Model.accountList = accountList;
	}

	public static ObservableList<Book2> getBorrowList() {
		return borrowList;
	}

	public static void setBorrowList(ObservableList<Book2> borrowList) {
		Model.borrowList = borrowList;
	}
	
	public static ObservableList<Book> getReturnList() {
		return returnList;
	}

	public static void setReturnList(ObservableList<Book> returnList) {
		Model.returnList = returnList;
	}

	
}
