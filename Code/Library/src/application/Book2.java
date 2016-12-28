package application;


import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Book2 {
	
	private final SimpleStringProperty isbn;
	private final SimpleStringProperty author;
	private final SimpleStringProperty name;
	private final SimpleStringProperty year;
	private final SimpleStringProperty availability;
	private final SimpleStringProperty position;
	private SimpleStringProperty from;
	private SimpleStringProperty until;
	private Button button;
	private VBox buttonBox;
	private VBox infoBox;
	private HBox completeBox;
	private HBox searchCompleteBox;
	

	private Label untilLabel;
	private ImageView bookImage;
	private ImageView searchBookImage;

	private VBox imageBox;
	private VBox searchImageBox;
	
	

	public Book2(String isbn, String author, String name, String year,
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
		this.buttonBox = new VBox();
		
		Label nameLabel = new Label(name);
		nameLabel.setFont(new Font("System",18));
		Label authorLabel = new Label("von " + author);
		authorLabel.setFont(new Font("System",14));
		
		this.infoBox = new VBox();
		this.infoBox.getChildren().add(nameLabel);
		this.infoBox.getChildren().add(authorLabel);
		
		this.completeBox = new HBox();
		this.completeBox.getChildren().add(infoBox);
		this.completeBox.setPadding(new Insets(10));
		this.completeBox.setSpacing(20);
		this.imageBox = new VBox();
		this.imageBox.setAlignment(Pos.CENTER);
		imageBox.setMinSize(80, 70);
		
		//Aufbau für den Search Dialog
		VBox searchInfoBox = new VBox();
		Label searchNameLabel = new Label(name);
		searchNameLabel.setFont(new Font("System",18));
		Label searchAuthorLabel = new Label("von " + author);
		searchAuthorLabel.setFont(new Font("System",14));
		Label positionLabel;
		if(availability.equals("0")) {
			positionLabel = new Label("alle Artikel sind ausgeliehen");
		}
		else {
			positionLabel = new Label("im Regal " + position);
		}
		positionLabel.setFont(new Font("System",14));
		Label availabilityLabel = new Label(availability + " sind verfügbar ");
		availabilityLabel.setFont(new Font("System",14));
		searchInfoBox.getChildren().addAll(searchNameLabel,searchAuthorLabel,positionLabel,availabilityLabel);
		this.searchCompleteBox = new HBox();
		this.searchCompleteBox.getChildren().add(searchInfoBox);
		this.searchCompleteBox.setPadding(new Insets(10));
		this.searchCompleteBox.setSpacing(20);
		this.searchImageBox = new VBox();
		this.searchImageBox.setAlignment(Pos.CENTER);
		searchImageBox.setMinSize(80, 70);
		
	}

	public ImageView getBookImage() {
		return bookImage;
	}

	public void setBookImage(ImageView bookImage) {
		this.bookImage = bookImage;
		this.bookImage.setFitHeight(80);
		this.bookImage.setPreserveRatio(true);
		this.bookImage.setSmooth(true);
		this.imageBox.getChildren().add(this.bookImage);
		this.completeBox.getChildren().add(0,imageBox);
	}
	
	public ImageView getSearchBookImage() {
		return searchBookImage;
	}

	public void setSearchBookImage(ImageView searchBookImage) {
		this.searchBookImage = searchBookImage;
		this.searchBookImage.setFitHeight(80);
		this.searchBookImage.setPreserveRatio(true);
		this.searchBookImage.setSmooth(true);
		this.searchImageBox.getChildren().add(this.searchBookImage);
		this.searchCompleteBox.getChildren().add(0,searchImageBox);
	}

	public HBox getCompleteBox() {
		return completeBox;
	}

	public void setCompleteBox(HBox completeBox) {
		this.completeBox = completeBox;
	}
	

	public HBox getSearchCompleteBox() {
		return searchCompleteBox;
	}

	public void setSearchCompleteBox(HBox searchCompleteBox) {
		this.searchCompleteBox = searchCompleteBox;
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
	
	public Label getUntil() {
		return untilLabel;
	}

	public Label getUntilLabel() {
		return untilLabel;
	}

	public void setUntilLabel(String until) {
		this.untilLabel = new Label(until);
		untilLabel.setFont(new Font("System",14));
		this.infoBox.getChildren().add(this.untilLabel);
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
	
	public VBox getButtonBox() {
		return buttonBox;
	}

	public void setButtonBox(VBox buttonBox) {
		this.buttonBox = buttonBox;
	}


	public VBox getInfoBox() {
		return infoBox;
	}

	public void setInfoBox(VBox infoBox) {
		this.infoBox = infoBox;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book2 other = (Book2) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.get().equals(other.isbn.get()))
			return false;
		return true;
	}
	
	
}
