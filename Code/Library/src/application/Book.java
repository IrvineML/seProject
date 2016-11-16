package application;

public class Book {
	
	private String isbn;
	private String author;
	private String name;
	private String year;
	
	public Book(String isbn, String author, String name, String year) {
		this.isbn = isbn;
		this.author = author;
		this.name = name;
		this.year = year;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	

}
