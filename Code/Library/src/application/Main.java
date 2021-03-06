package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = (Pane) FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
			Scene scene = new Scene(root,1024,768);
			scene.getStylesheets().add(getClass().getResource("../View/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Shabo Client");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
