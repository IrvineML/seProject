package application;

import javafx.beans.property.SimpleStringProperty;

public class Book {
	
	private final SimpleStringProperty isbn;
	private final SimpleStringProperty author;
	private final SimpleStringProperty name;
	private final SimpleStringProperty year;
	
	public Book(String isbn, String author, String name, String year) {
		this.isbn = new SimpleStringProperty(isbn);
		this.author = new SimpleStringProperty(author);
		this.name = new SimpleStringProperty(name);
		this.year = new SimpleStringProperty(year);
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
	

}
