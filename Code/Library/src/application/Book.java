package application;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringPropertyBase;
import javafx.scene.control.Button;

public class Book {
	
	private final SimpleStringProperty isbn;
	private final SimpleStringProperty author;
	private final SimpleStringProperty name;
	private final SimpleStringProperty year;
	private final SimpleStringProperty availability;
	private final SimpleStringProperty position;
	private SimpleStringProperty from;
	private SimpleStringProperty until;
	private Button button;
	
	

	public Book(String isbn, String author, String name, String year,
				String availability, String position) {
		this.isbn = new SimpleStringProperty(isbn);
		this.author = new SimpleStringProperty(author);
		this.name = new SimpleStringProperty(name);
		this.year = new SimpleStringProperty(year);
		this.availability = new SimpleStringProperty(availability);
		this.position = new SimpleStringProperty(position);
		this.from = new SimpleStringProperty("");
		this.until = new SimpleStringProperty("");
		this.button = new Button();
	}

	public String getIsbn() {
		return isbn.get();
	}


	public String getAuthor() {
		return author.get();
	}


	public String getName() {
		return name.get();
	}


	public String getYear() {
		return year.get();
	}
	
	public String getPosition() {
		return position.get();
	}
	
	public String getAvailability() {
		return availability.get();
	}

	public String getFrom() {
		return from.get();
	}

	public void setFrom(String from) {
		this.from.setValue(from);
	}
	
	public String getUntil() {
		return until.get();
	}

	public void setUntil(String until) {
		this.until.setValue(until);
	}

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}
	
	
	
}
