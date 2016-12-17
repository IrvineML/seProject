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
	private Label untilLabel;
	private ImageView bookImage;
	private VBox imageBox;
	
	

	

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
		//Label untilLabel = new Label("ausgeliehen bis 01.01.2017");
		//untilLabel.setFont(new Font("System",14));
		//this.infoBox.getChildren().add(untilLabel);
		this.completeBox = new HBox();
		this.completeBox.getChildren().add(infoBox);
		this.completeBox.setPadding(new Insets(10));
		this.completeBox.setSpacing(20);
		this.imageBox = new VBox();
		this.imageBox.setAlignment(Pos.CENTER);
		imageBox.setMinSize(80, 70);
	}

	public ImageView getBookImage() {
		return bookImage;
	}

	public void setBookImage(ImageView bookImage) {
		this.bookImage = bookImage;
		this.bookImage.setFitHeight(80);
		this.bookImage.setPreserveRatio(true);
		this.bookImage.setSmooth(true);
		this.imageBox.getChildren().add(bookImage);
		this.completeBox.getChildren().add(0,imageBox);
	}

	public HBox getCompleteBox() {
		return completeBox;
	}

	public void setCompleteBox(HBox completeBox) {
		this.completeBox = completeBox;
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
