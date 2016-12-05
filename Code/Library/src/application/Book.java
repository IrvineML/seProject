package application;


import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;


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
	private HBox buttonBox;
	
	

	

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
		this.buttonBox = new HBox();
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
	
	public HBox getButtonBox() {
		return buttonBox;
	}

	public void setButtonBox(HBox buttonBox) {
		this.buttonBox = buttonBox;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.get().equals(other.isbn.get()))
			return false;
		return true;
	}
	
	
	
	
	
}
